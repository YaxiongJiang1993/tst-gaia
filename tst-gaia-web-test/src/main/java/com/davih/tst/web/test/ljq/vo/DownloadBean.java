package com.davih.tst.web.test.ljq.vo;

import lombok.Data;

/**
 * @Description: 下载
 * @Author: junqiang.lu
 * @Date: 2018/12/24
 */
@Data
public class DownloadBean {

    private static final long serialVersionUID = 6877955227522370690L;

    /**
     * 语言类型
     */
    private String language;

    /**
     * 待下载文件名
     */
    private String fileName;
}
