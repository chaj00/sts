package emp.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
//MultipartFile이 갖고 있는 업로드된 파일의 바이트 데이터를 실제 서버에 파일로 생성하는 작업을 수행
public class FileUploadService {
	FileOutputStream fos;
	public void upload(MultipartFile file, String path, String fileName){
		try{
			byte[] data = file.getBytes();
			fos = new FileOutputStream(path+File.separator+fileName);
			fos.write(data);
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try{
				if(fos!=null)fos.close();
				
			}catch(IOException e){
				
			}
			
		}
		
		
	}
}
