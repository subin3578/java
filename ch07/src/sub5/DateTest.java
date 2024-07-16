package sub5;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
 * 날짜 : 2024/07/16
 * 이름 : 황수빈 
 * 내용 : 자바 Date클래스 실습하기 
 */

public class DateTest {
	
	public static void main(String[] args) {
		
		// Date 클래스
		Date date = new Date(); //
		System.out.println("date : " + date);
		//형식 지정 (SimpleDateFormat)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String result = sdf.format(date);
		System.out.println("result= " + result);
		
		// Calendar 클래스 ( .getInstance 사)
		Calendar cal = Calendar.getInstance(); //싱글톤 패턴 
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH)+1; //January 가 0이라서 +1 해야 now
		int dd = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%02d-%02d %02d:%02d:%02d",yy,mm,dd,hour,min,sec);
		
		
		
	}

}
