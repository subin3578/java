package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *  날짜 : 2024/07/18
 *  이름 : 황수빈 
 *  내용 : 역직렬화 실습하기 (파일 => 객체)
 */
public class DeserializeTest2 {
	
	
	public static void main(String[] args) {
	
		Apple apple1 = new Apple("한국",3000);
		String path = "/Users/hwangsubin/Desktop/apple.txt";
		
		try {
			FileInputStream fos = new FileInputStream(path);
			// 직렬화 객체를 내보내기 위한 보조스트림 
			ObjectInputStream ois = new ObjectInputStream(fos);
			
			// 역직렬화 
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			//스트림 
			ois.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
