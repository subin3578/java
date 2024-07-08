package Test20;

import java.util.Scanner;

public class BankApplication {
	public static Account[] accountArray = new Account[100];
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("-----------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("-----------------------------------");
		System.out.println("선택> ");
		int N = sc.nextInt();
		if(N==1){ 
		
			makeAccount(); 
		}else if(N==2) {
		
			showList(); 
		}else if(N==3) {
		
			deposit();
		}else if(N==4){	
			withdraw();
		}else if(N==5) {
			System.out.println("종료합니다");
			break;
		}
		}	
	}
	
	public static void print1() {
		System.out.println("----------");
		System.out.println(" 계좌 생성 ");
		System.out.println("----------");
		
	}
	public static void print2() {
		System.out.println("----------");
		System.out.println(" 계좌 목록 ");
		System.out.println("----------");
		
	}
	public static void print3() {
		System.out.println("----------");
		System.out.println(" 예금 ");
		System.out.println("----------");
		
	}
	public static void print4() {
		System.out.println("----------");
		System.out.println(" 출금 ");
		System.out.println("----------");
		
	}

	// 계좌 생성 
	public static void makeAccount(){	
		print1();
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호 입력:" );
		String number = sc.next();
		System.out.println("계좌주 입력:" );
		String name = sc.next();
		System.out.println("초기입금액 입력:" );
		int balance = sc.nextInt();

		Account newAccount = new Account(number,name,balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]== null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	// 계좌 목록
	public static void showList() {
		print2();
		for(int i=0;i<accountArray.length;i++) {
			Account account = accountArray[i];
		
			if(accountArray[i] != null) {
				// Account 클래스내에 toString 출력 메소드 만들었음
				System.out.println(account.toString());
				}
		
		}
	}
	
	public static void deposit() {
		print3();
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호를 입력하시오:");
		String AccountNum = sc.next();
		System.out.println("입금액 : ");
		int Depositbal = sc.nextInt();
		
		Account account  = findAccount(AccountNum);
		
		if(account == null) {
			System.out.println("계좌 없음");
			return;
		}
		
		account.setBalance(account.getBalance()+Depositbal);
		System.out.println(Depositbal+"만큼 예금 성공");
		
		
		
	}
	public static void withdraw() {
		print4();
		Scanner sc = new Scanner(System.in);
		System.out.println("계좌번호를 입력하시오:");
		String AccountNum = sc.next();
		System.out.println("출금액 : ");
		int withdrawbal = sc.nextInt();
		
		Account account  = findAccount(AccountNum);
		
		if(account == null) {
			System.out.println("계좌 없음");
			return;
		}
		
		account.setBalance(account.getBalance()-withdrawbal);
		System.out.println(withdrawbal+"만큼 출금 성공");
		
		
		
	}
	 private static Account findAccount(String number) {

	        Account account = null; 

	        for (int i = 0; i < accountArray.length; i++) {
	        	// 어카운트 값이 비어있지 않으면, 클래스 Account 에서 getNumber을 이용하여 넘버 가져옴
	        	//입력 받은 값과 저장되어 있는 값이 같으면 그 계좌번호를 return하는 함수
	            if (accountArray[i] != null) {
	                String accountNum = accountArray[i].getNumber();
	                if (accountNum.equals(number)) {
	                    account = accountArray[i];
	                    break;
	                }
	            }

	        }
	        return account;
	    }
}
