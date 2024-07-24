package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
/*
 * 날짜 : 2024/07/24 
 * 이름 : 황수빈
 * 내용 : HTTP 통신 실습
 */

public class HttpTest {
	
	public static void main(String[] args) {
		
		try{
			URL url = new URL("https://naver.com");									
			
			
			FileOutputStream fos = null;
			BufferedReader br = null;
			
			String line = null;
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
			
			while((line = br.readLine())!=null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
		}catch (MalformedURLException e) {
			e.printStackTrace();						
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
