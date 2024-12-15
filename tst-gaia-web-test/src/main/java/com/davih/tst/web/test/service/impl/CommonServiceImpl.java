package com.davih.tst.web.test.service.impl;


import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;
import cn.hutool.core.util.StrUtil;
import com.davih.tst.web.test.ljq.api.ApiResult;
import com.davih.tst.web.test.ljq.api.ResponseCode;
import com.davih.tst.web.test.service.CommonService;
import com.davih.tst.web.test.sftp.SftpUtil;
import com.davih.tst.web.test.web_config.SftpUploadConfig;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

/**
 * @Description: 公共业务具体实现类
 * @Author: junqiang.lu
 * @Date: 2018/12/24
 */
@Slf4j
@Service("commonService")
public class CommonServiceImpl implements CommonService {

    @Autowired
    private SftpUploadConfig uploadConfig;

    /**
     * 通过 sftp 上传附件至固定服务器
     *
     * @param file 文件
     * @param dir  文件夹名称
     * @return
     * @throws Exception
     */
    @Override
    public ApiResult uploadSftp(MultipartFile file, String dir) throws Exception {
        if (Objects.isNull(file) || file.isEmpty()) {
            throw new RuntimeException(ResponseCode.MISS_REQUEST_PART_ERROR.getMsg());
        }
        log.debug("原始文件名:{},文件大小: {} Mb", file.getOriginalFilename(), (file.getSize() / 1048576));
        // 储存文件
        SftpUtil.SftpConfig sftpConfig = SftpUtil.sftpConfig();
        BeanUtil.copyProperties(uploadConfig, sftpConfig, CopyOptions.create().ignoreNullValue().ignoreError());
        String filePath;
        if (StrUtil.isNotBlank(dir)) {
            dir = dir.replaceAll("[^a-zA-Z0-9]", "");
        }
        try {
            filePath = SftpUtil.upload(sftpConfig, dir, System.currentTimeMillis() +
                    file.getOriginalFilename(), file.getInputStream());
        } catch (Exception e) {
            log.warn("文件上传失败,{}", e.getMessage());
            throw new RuntimeException(ResponseCode.FAIL.getMsg());
        }
        return ApiResult.success(filePath);
    }

    /**
     * 通过 sftp 下载文件
     *
     * @param filePath 文件路径
     * @return
     * @throws JSchException
     * @throws SftpException
     * @throws IOException
     */
    @Override
    public ResponseEntity<byte[]> downloadSftp(String filePath) throws JSchException, SftpException, IOException {
        SftpUtil.SftpConfig sftpConfig = SftpUtil.sftpConfig();
        BeanUtil.copyProperties(uploadConfig, sftpConfig, CopyOptions.create().ignoreNullValue().ignoreError());
        byte[] bytes = SftpUtil.download(sftpConfig, filePath);
        HttpHeaders headers = new HttpHeaders();
        String fileName = filePath.substring(filePath.lastIndexOf("/") + 1);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", new String(fileName.getBytes("UTF-8"), "ISO-8859-1"));
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
}
