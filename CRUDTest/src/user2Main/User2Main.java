package user2Main;

import java.util.Scanner;

import user2.dao.User2DAO;
import user2.vo.User2VO;


public class User2Main {

	public static void main(String[] args) {
		
		User2DAO dao = User2DAO.getInstance();
		Scanner sc = new Scanner(System.in);
		

		System.out.println("------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("------------------------");
		
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				System.out.print("아이디  입력 : ");
				String uid = sc.next();
				
				System.out.print("이름  입력 : ");
				String name = sc.next();
				
				System.out.print("생년월일  입력 : ");
				String birth = sc.next();
				
				System.out.print("휴대폰  입력 : ");
				String hp = sc.next();
				
				System.out.print("나이  입력 : ");
				int age = sc.nextInt();
				
				User2VO vo = new User2VO(uid, name, birth, hp, age);
			
				dao.insertUser(vo);
				int result = dao.insertUser(vo);
				if(result > 0) {
					System.out.println("회원 가입 완료!");
				}else {
					System.out.println("회원 가입에 실패하였습니다.");
				}
				
			}else if(answer ==2) {
				System.out.println("아이디 입력: ");
				String insertUid = sc.next();
				
				User2VO user = dao.selectUser(insertUid);

				if(user != null) {
					System.out.println(user.toString());
					System.out.println("조회 완료!");
				}else{
					System.out.println("존재하지 않는 아이디입니다.");
				}
				// 여기까지 DAO 와 Main 둘다 완료
				// 2024/08/01에 selectUsers() 와 Main 코드부터 시작하면 됨
			}else if(answer==3) {
				
			}else if(answer==4) {
				
			}else if(answer==5) {
				
			}
			
		}
	}
}