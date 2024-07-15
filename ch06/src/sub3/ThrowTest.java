package sub3;
/*
 * 날짜 : 2024.07.15
 * 이름 : 황수빈  
 * 내용 : 예외 발생 시키기
 */

class Score {
	public void check(int score) throws Exception {
		
		if(score<0) {
			//예외 발생 시키기
			throw new Exception("점수는 음수가 될 수 없습니다");
		}else if(score>100) {
			throw new Exception("점수는 100점이 넘을 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니");
		}
		
	}
}
public class ThrowTest {

	public static void main(String[] arg) throws Exception {
		
		Score score = new Score();
		try {
		score.check(-10);
		score.check(80);
		score.check(120);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료 ");
	}
}
