package com.davih.tst.web.test.web_config;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: sftp 附件上传配置
 * @Author: david.jiang
 * @Date: 2024/12/16
 */
@ToString
@Getter
@Configuration
public class SftpUploadConfig {

    /**
     * 主机地址
     */
    @Value("${uploadSftp.host}")
    private String host;
    /**
     * sftp 连接端口
     */
    @Value("${uploadSftp.port}")
    private int port;

    /**
     * 用户名
     */
    @Value("${uploadSftp.username}")
    private String username;
    /**
     * 密码
     */
    @Value("${uploadSftp.password}")
    private String password;
    /**
     * 文件保存路径
     */
    @Value("${uploadSftp.path}")
    private String path;

}

