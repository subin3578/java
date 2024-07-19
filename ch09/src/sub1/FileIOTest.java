package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * 날짜 : 2024/07/18 
 * 이름 : 황수빈
 * 내용 : 파일 입출력 스트림 실습 
 */

public class FileIOTest {
	public static void main(String[] args){
	
		String source = "/Users/hwangsubin/Desktop/sample1.txt"; 
		String target = "/Users/hwangsubin/Desktop/sample2.txt";
		
		try {
		FileInputStream fis = new FileInputStream(source); // InputStream
		FileOutputStream fos = new FileOutputStream(target);
		
			while(true) {
				int data = fis.read();
			
				if(data == -1) {
					break;
				} // 더이상 읽을 내용이 없을 때
			
			//파일 읽은 내용그대로 출력 - OutputStream
			System.out.println(data); // 아스키코드 숫자로 변환되서 나옴 
			
			char ch = (char) data; // 강제 타입 변화
			
			System.out.println(ch); // 아스키코드 영어는 됨 한글은 유니코드 씀 
			
			// 파일 쓰기
			fos.write(data);
			}
			
		
		
			
			// 스트림 해제 
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