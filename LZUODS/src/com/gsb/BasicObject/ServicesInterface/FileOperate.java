package com.gsb.BasicObject.ServicesInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface FileOperate {
	public boolean upload( MultipartFile file) throws IllegalStateException, IOException;
	public boolean download( String file_name, OutputStream os) throws FileNotFoundException, IOException;
	public List<String> readFilesList();
}
