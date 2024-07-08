package Test20_retry;

import java.util.Scanner;

public  class BankApplication {
	
	Scanner sc = new Scanner(System.in);
	public static Account[] accountArray = new Account[100];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.println("선택> ");
		int N = sc.nextInt();

		if(N==1) {
			print1();
		makeAccount();
		}else if(N==2) {
			print2();
		showAccList();
		}
		}
		// 초기 출력값 입력
		// 1 누르면 makeAccount
		// 2 누르면 ......
	}
	
	public static void makeAccount() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계좌번호: ");
		String newano = sc.next();
		System.out.println("계좌주 : ");
		String newaname = sc.next();
		System.out.println("초기입금액: ");
		int newbalance = sc.nextInt();
		//Scanner 이용해서 값 입력받은 뒤 새로운 변수인 클래스Account 선언
		//배열에 집어넣어야함 'for'문을 이용하여 넣어햐함
		Account newAccount = new Account(newano,newaname,newbalance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
				}
		}
	}
		
	
	
	public static void showAccList() {
		// 배열에 있는 값은 주소값이므로 
		// 그 주소값이 가르키는 값을 찾아 출력하는 함수 toString을 만들어 출력
		// 배열이므로 'for'써서 출력해야함
		for(int i=0;i<accountArray.length;i++) {
			if (accountArray[i]!=null) {
				Account account = accountArray[i];
				System.out.println(account.toString());
			}
		}
	}
	
	public void deposit(int balance) {
		// checkmatch로 확인한 후 맞으면 balance 값 추가
		
		int depbal = sc.nextInt();
		
	}
	
	public void withdraw(int balance) {
		
	}
	public void checkmatch() {
		//deposit() 과 withdraw()에서 입력받은 계좌와 
		// 목록의 계좌를 비교하여 맞으면 return 뭘 return 해야할까?
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
}

