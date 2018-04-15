package com.gsb.BasicObject.Services;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.gsb.BasicObject.ServicesInterface.FileOperate;

@Service
public class FileHandler implements FileOperate {

	static File cloudFilesDir;
	
	long downloadedLen;
	long uploadedLen;
	
	public FileHandler() {
		if( null == cloudFilesDir) {
			cloudFilesDir = new File( System.getProperty("ods.webroot") + "/cloudFiles");
		}

		if( !cloudFilesDir.exists() || !cloudFilesDir.isDirectory()) {
			cloudFilesDir.mkdir();
		}
	}
	
	public long getDownloadedLen() {
		return downloadedLen;
	}

	private void setDownloadedLen(long downloadedLen) {
		this.downloadedLen = downloadedLen;
	}

	public long getUploadedLen() {
		return uploadedLen;
	}

	private void setUploadedLen(long uploadedLen) {
		this.uploadedLen = uploadedLen;
	}
	

	@Override
	public boolean upload(MultipartFile uploadFile) throws IllegalStateException, IOException {
		Boolean result = false;
		if( null == cloudFilesDir || !cloudFilesDir.canWrite()) {
			return result;
		}
		long totalLen = uploadFile.getSize();
		File file = new File( cloudFilesDir.getAbsolutePath()+"/"+uploadFile.getOriginalFilename());
		System.out.println( "file location:"+file.getAbsolutePath());
		if( !file.exists()) {
			synchronized( result) {
				uploadFile.transferTo( file);
				result = true;
			}
		}
		return result && file.length() == totalLen;
	}

	@Override
	public boolean download(String file_name, OutputStream os) throws IOException {
		if( null == cloudFilesDir || !cloudFilesDir.canWrite()) {
			return false;
		}
		File file = this.getFile(file_name);
		if( file == null) {
			return false;
		}
		long totalLen = file.length();
		this.setDownloadedLen(0);
		InputStream fis = new FileInputStream( file);
		byte[] buf = new byte[2048];
		int len = 0;
		while( (len = fis.read( buf)) > 0) {
			synchronized( this) {
				os.write( buf, 0, len);
				this.setDownloadedLen(this.getDownloadedLen() + len);
			}
		}
		fis.close();
		return this.getDownloadedLen() == totalLen;
	}
	private File getFile( String file_name) {
		File file = new File( cloudFilesDir.getAbsolutePath() + "/" +file_name);
		if( !file.exists()) {
			file = null;
		}
		return file;
	}

	@Override
	public List<String> readFilesList() {
		if( null == cloudFilesDir || !cloudFilesDir.canRead()) {
			return null;
		}
		List<String> names = new ArrayList<>();
		File[] files =	cloudFilesDir.listFiles();
		for( int i=0; i<files.length; i++) {
			names.add( files[i].getName());
		}
		return names;
	}
}
