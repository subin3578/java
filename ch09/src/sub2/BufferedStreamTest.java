package sub2;
/*
 * 날짜 : 2024/07/18 
 * 이름 : 황수빈
 * 내용 : 파일 입출력 스트림 실습 
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {
	public static void main(String[] args){
		
		String source = "/Users/hwangsubin/Desktop/workspace.zip";
		String target = "/Users/hwangsubin/Desktop/workspace2.zip";
		
		try {
		
		// 입스트림 생성 및 파일 연결
		FileInputStream fis = new FileInputStream(source); // InputStream
		FileOutputStream fos = new FileOutputStream(target);
		// 보조 스트림
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
			while(true) {
				int data = bis.read();
			
				if(data == -1) {
					break;
				} // 더이상 읽을 내용이 없을 때
		
		
		//파일 읽은 내용그대로 출력 - OutputStream
		//	System.out.println(data); // 아스키코드 숫자로 변환되서 나옴 
			
		//	char ch = (char) data; // 강제 타입 변화
			
		//	System.out.println(ch); // 아스키코드 영어는 됨 한글은 유니코드 씀 
			
			// 파일 쓰기
			bos.write(data);
			}
			
		
		
			bos.flush();
			// 스트림 해제 
			
			bis.close();
			bos.close();
			
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
