package com.neo.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2018/1/11.
 */

public interface IimportService {

    Integer importExcel(MultipartFile myFile);
}
