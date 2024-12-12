package com.davih.tst.web.test.controller;


import com.davih.tst.web.test.ljq.api.ApiResult;
import com.davih.tst.web.test.service.CommonService;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.SftpException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @Description: 公共模块控制中心
 * @Author: junqiang.lu
 * @Date: 2018/12/24
 */
@RestController
@RequestMapping("/tst/gaia/sftp")
public class SftpController {

    private static final Logger logger = LoggerFactory.getLogger(SftpController.class);

    @Autowired
    private CommonService commonService;

    /**
     * 通过 sftp 上传附件至固定服务器
     *
     * @param file 文件
     * @param dir 文件夹名称
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/upload", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ApiResult> uploadSftp(@RequestParam("file") MultipartFile file,
                                                String dir) throws Exception {
        ApiResult apiResult = commonService.uploadSftp(file, dir);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(apiResult, headers, HttpStatus.OK);
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
    @GetMapping(value = "/download", produces = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<byte[]> downloadSftp(String filePath) throws JSchException, SftpException, IOException {
        ResponseEntity<byte[]> responseEntity = commonService.downloadSftp(filePath);
        return responseEntity;
    }

}

