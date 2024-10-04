package human.class1.file;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class FileController {

	@RequestMapping("uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}

	@RequestMapping("upload")
	public String upload( MultipartHttpServletRequest req) {

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: "+title);
		System.out.println("content: "+content);
		
		//파일처리 
		MultipartFile mf = req.getFile("file1");
		
		long fileSize = mf.getSize(); //파일의 크기
		System.out.println("fileSize: "+fileSize);
		
		String fileName = mf.getOriginalFilename();
		System.out.println("fileName: "+fileName);
		
		try {
			String path = "E:\\9.temp\\upload";
			String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName; 
			// 경로 + 지금 시간 , 파일 명이 겹치지 않도록 
			File file = new File(safeFileName);
			
			mf.transferTo(file);
			
		} catch(IllegalStateException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return "uploadForm";
	}
	
	//파일 복수 선택이 가능하도록 
	@RequestMapping("/uploads")
	public String uploads( MultipartHttpServletRequest req) {

		String title = req.getParameter("title");
		String content = req.getParameter("content");
		System.out.println("title: "+title);
		System.out.println("content: "+content);
		
		//파일처리 
//		MultipartFile mf = req.getFile("file1");
		List<MultipartFile> fileList = req.getFiles("file1");
		//반복문 돌아야되겠지
		for(MultipartFile mf : fileList) {
			long fileSize = mf.getSize(); //파일의 크기
			System.out.println("fileSize: "+fileSize);
			
			String fileName = mf.getOriginalFilename();
			System.out.println("fileName: "+fileName);
			
			try {
				String path = "E:\\9.temp\\upload";
				String safeFileName = path + "\\" + System.currentTimeMillis() + "_" + fileName; 
				// 경로 + 지금 시간 , 파일 명이 겹치지 않도록 
				File file = new File(safeFileName);
				
				mf.transferTo(file);
				
			} catch(IllegalStateException e) {
				e.printStackTrace();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		return "uploadForm";
	}
}
