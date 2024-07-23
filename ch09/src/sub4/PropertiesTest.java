package sub4;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
 *  날짜 : 2024/07/18
 *  이름 : 황수빈 
 *  내용 : 프로퍼티 직렬화 실습 
 *  
 * 프로퍼티 (Properties)
 *  - 문자열 데이터만 취급하는 key-value 자료구조 클래스 
 *  - 직렬화, 역직렬화를 이용해 데이터를 입출력하는 자료구조 클래스 
 *  - 프로그램 환경설정값을 저장할 때 많이 사용 
 */

public class PropertiesTest {
	
	public static void main(String[] args) {
		// 프로퍼티 생성
		Properties prop = new Properties();	
		prop.setProperty("A","Apple");
		prop.setProperty("B","Banana");
		prop.setProperty("C","Cherry");
	
		System.out.println(prop);
		
		// 프로퍼티 직렬화(파일 저장) 
		String path = "/Users/hwangsubin/Desktop/fruit.properties";
		
	
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			prop.store(fos, null);	
			
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	

		// 프로퍼티 역직렬화 (파일 읽기) 
		
		String path2 = "/Users/hwangsubin/Desktop/city.properties";
		
		Properties cityprop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path2);
			
			cityprop.load(fis);	
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(cityprop);
		System.out.println(cityprop.getProperty("kor"));
	}

}
