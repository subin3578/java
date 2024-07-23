package Test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 {

	
	public static void main(String[] args) {
		
		String path = "/Users/hwangsubin/Desktop/Gugudan.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2;x<=9;x++) {
				System.out.println(x+"단 ");
				
				for(int y =1;y<=9;y++) {
					int z = x * y;
					System.out.println(x+"X"+y+"="+(x*y));
				}
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일 생성 완료... ");
	}
}