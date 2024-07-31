package user2;

import java.util.List;
import java.util.Scanner;

import user1.UserDAO;

/*
 * 날짜 : 2024/07/30
 * 이름 : 황수빈
 * 내용 : CRUD 실습하기
 */
public class User2Main {

	public static void main(String[] args) {
		
		System.out.println("---------------------------");
		System.out.println("User2 회원 관리 매니저 v1.1");
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.println("선택> ");
			
			int answer = sc.nextInt();
			if(answer == 0) {
				break;
			}else if(answer==1){
				System.out.println("아이디 입력: ");
				String uid = sc.next();
				
				System.out.println("이름 입력: ");
				String name = sc.next();
				
				System.out.println("생년월일 입력: ");
				String birth = sc.next();
				
				System.out.println("휴대폰 입력: ");
				String hp = sc.next();
				
				System.out.println("나이 입력: ");
				int age = sc.nextInt();
				
				User2VO vo = new User2VO(uid, name, birth, hp, age);
				User2DAO dao = User2DAO.getInstance();
				dao.insertUser(vo);
			
			}else if(answer==2){
				User2DAO dao = User2DAO.getInstance();
				List<User2VO> users = dao.selectUsers();
				
				for(User2VO user : users) {
					System.out.println(user);
				}
				
			}else if(answer==3){
				System.out.println("조회할 아이디: ");
				String uid = sc.next();
			}else if(answer==4){
				
			}else if(answer==5){
				
			}
			
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}