package file.upload;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {
	private static final long serialVersionUID = 2341123413L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String encoding = "utf-8";
		request.setCharacterEncoding(encoding);
		
				
		
		try {
			// File: 파일 또는 디렉토리(폴더)를 관리하는 class
			File currentDirPath = new File("E:\\9.temp\\upload"); // 폴더명
			
			DiskFileItemFactory factory = new DiskFileItemFactory();
			factory.setRepository(currentDirPath); //경로 지정
			factory.setSizeThreshold(1024 * 1024); //임시파일의 크기를 byte단위로 (1024*1024는 1메가바이트)

			ServletFileUpload upload = new ServletFileUpload(factory);
			// 업로드 파일의 최대 크기 지정 
			upload.setFileSizeMax(1024*1024*100); //100메가바이트 100MB
			
			// request를 분석해서 각각의 getParameter할 수 있는 것들을 FileItem형식으로 뽑아냄
			// 그걸 List에 담아서 돌려줌 
			List<FileItem> items = upload.parseRequest(request);
			for (int i = 0; i < items.size(); i++) {
				
				FileItem fileItem = (FileItem) items.get(i);

				// form 요소인지 판별 
				if (fileItem.isFormField()) {
					// getFieldName: 파라메터 key
					// getString: 파라메터 value
					System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
				} else {
					// 첨부파일 영역
					// 0 인거 처리 안하겠다 
					// getSize: 파일크기
					if (fileItem.getSize() > 0) {
						// 파일명 추출 getName
						String fileName = fileItem.getName();
						
						fileName = System.currentTimeMillis() + "_" + fileName;
						
						File uploadFile = new File(currentDirPath + "\\" + fileName);
//						File uploadFile = new File(currentDirPath + File.separator + fileName);
//						File uploadFile = new File(currentDirPath + System.getProperty("file.separator") + fileName);
						
						// 파일저장
						fileItem.write(uploadFile);
						
					} // end if
				} // end if
			} // end for
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
