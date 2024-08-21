package file.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download.do")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fileName = request.getParameter("fileName");
		//fileName = request.getParameter("fileName");
		File downFile = new File("E:\\9.temp\\upload\\"+fileName);
		
		// 브라우저 캐시를 사용하지 않도록 설정
		response.setHeader("Cache-Control", "no-cache");
		// 지금 응답이 첨부파일이라는 것을 알려줌
        response.addHeader("Content-disposition", "attachment; fileName="+ fileName);
        
        // pc에 있는 파일을 읽는 흐름을 열기
        FileInputStream fis = new FileInputStream( downFile );
        // 흐름에서 java 메모리로 퍼올릴 바가지 크기 설정
        byte[] buf = new byte[1024 * 1];
        
        // 브라우저로 내보낼 수 있는 흐름을 열어서 준비
        OutputStream os = response.getOutputStream();
        
        while(true) {
        	
        	// 파일에서 바가지 크기만큼 읽어서 바가지에 담아두기
        	// 읽은 만큼 돌려줌
        	// count 출력하면 읽은 byte가 나옴
        	int count = fis.read(buf);
        	
        	// 읽을 게 없을 때 -1
        	// 반복문 종료
        	if(count== -1) {
        		break;
        	}
        	
        	// buf를 처음부터 읽은 만큼만
        	// 내보내는 흐름에 바가지의 내용을 보낸다
        	// 0은 바가지 처음부터 
        	// count는 읽은 만큼
        	os.write(buf, 0 ,count);
        	
        }
        os.close();
        fis.close();
	}

}
