package sub2;
/*
 * 날짜 : 2024/07/18
 * 이름 : 황수빈
 * 내용 : 파일 트랜스퍼 실습 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTranferTest {
public static void main(String[] args){
		
		String source = "/Users/hwangsubin/Desktop/workspace.zip";
		String target = "/Users/hwangsubin/Desktop/workspace2.zip";
		
		
		try {
		
		// 입스트림 생성 및 파일 연결
		FileInputStream fis = new FileInputStream(source); // InputStream
		FileOutputStream fos = new FileOutputStream(target);
	
		
			fis.transferTo(fos); // 파일 업로드할때 보통 이것 이용함
		
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료 ....");
	}
}
