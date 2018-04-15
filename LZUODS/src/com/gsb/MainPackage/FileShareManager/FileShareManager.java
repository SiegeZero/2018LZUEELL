package com.gsb.MainPackage.FileShareManager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.gsb.BasicObject.Services.FileHandler;

@Controller
public class FileShareManager {
	
	@Autowired
	FileHandler file_handler;
	
	@RequestMapping( value="/upload.action")
	public String upload( MultipartFile uploadFile, HttpSession session, HttpServletRequest request) throws IllegalStateException, IOException {
		boolean uploadSuccess = file_handler.upload(uploadFile);
		request.setAttribute("uploadSuccess", ""+uploadSuccess);
		return "upload";
	}
	
	@RequestMapping( value="/upload")
	public String uploadPage( HttpServletResponse response, HttpServletRequest request) throws IOException {
		String uploadSuccess = (String) request.getAttribute("uploadSuccess");
		if( null != uploadSuccess ) {
			System.out.println(uploadSuccess);
		}

		return "upload";
	}
	
	@RequestMapping( value="/download")
	public String downloadPage(HttpServletResponse response, HttpServletRequest request) throws IOException {
		String downloadSuccess = (String) request.getAttribute("downloadSuccess");
		if( null != downloadSuccess) {
			System.out.println( downloadSuccess);
		}
		request.setAttribute("file_list", file_handler.readFilesList());
		return "download";
	}
	
	@RequestMapping( value="/download.action")
	public void download( @RequestParam("file_name")String file_name, HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	    response.setCharacterEncoding("utf-8");
	    response.setContentType("multipart/form-data");
	    System.out.println( "file_name:"+file_name);
	    response.setHeader("Content-Disposition", "attachment;fileName=" + new String(file_name.getBytes("utf-8"),"iso8859-1"));
	    ServletOutputStream os = response.getOutputStream();
		boolean downloadSuccess = file_handler.download(file_name, os);
//		String uri;
//		if( downloadSuccess) {
//			uri = request.getRequestURI()+"download";
//		} else {
//			uri = request.getRequestURI();
//		}
//		RequestDispatcher rd = request.getRequestDispatcher(uri);
//		rd.forward(request, response);
	}
}
