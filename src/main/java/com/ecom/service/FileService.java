package com.ecom.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

	public Boolean uploadFilesS3(MultipartFile file, Integer bucketType);
}
