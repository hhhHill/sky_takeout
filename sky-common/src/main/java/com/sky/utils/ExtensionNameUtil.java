package com.sky.utils;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件后缀名工具类
 */
public class ExtensionNameUtil {

    /**
     * 获取文件后缀名
     * @param file
     * @return
     */
    public static String getExtensionName(MultipartFile file){
        String fileName = file.getOriginalFilename();
        int index = fileName.lastIndexOf(".");
        return fileName.substring(index);
    }
}
