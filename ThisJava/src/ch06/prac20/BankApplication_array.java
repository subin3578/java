package ch06.prac20.copy;

import java.util.Scanner;

public class BankApplication {
	public static Scanner sc =new Scanner(System.in);
	public static Account[] arrayaccount = new Account[100];
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("----------------------------------------");
			System.out.println("1.계좌생성 2.계좌조회 3.입금 4.출금 5.종료");
			System.out.println("----------------------------------------");
			
			int N = sc.nextInt();
			
			if(N==1) {
		makeaccount();
		}else if(N==2) {
			showlist();
		}else if(N==3) {
			deposit();
		}else if(N==4){withdraw();
		}else if(N==5) {
			System.out.println("종료합니다");
			break;
			}
	}
	}
	
	public static void makeaccount(){
		
		System.out.println("------------");
		System.out.println(" 계좌생성");
		System.out.println("------------");
		
		System.out.println("계좌번호 입력");
		String Acnumber = sc.next();
		System.out.println("이름 입력");
		String name = sc.next();
		System.out.println("초기 입금금액");
		int balance = sc.nextInt();
		
		Account newaccount = new Account(Acnumber,name,balance);
		for(int i=0;i<arrayaccount.length;i++) {
			if(arrayaccount[i]==null) {
				arrayaccount[i] = newaccount;
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}
	}
	public static void showlist(){
		
		System.out.println("------------");
		System.out.println(" 목록");
		System.out.println("------------");
		
		for(int i=0;i<arrayaccount.length;i++) {

			if(arrayaccount[i]!=null) {
				Account account = arrayaccount[i];
			System.out.println(account.goString());}
		}
		
	}

	public static void withdraw(){
		
		System.out.println("------------");
		System.out.println(" 출금");
		System.out.println("------------");
		
		System.out.println("계좌입력");
		String Acnumber = sc.next();
		System.out.println("출금금액");
		int withdraw = sc.nextInt();
		
		
		Account account = check(Acnumber);
		if(account == null) { 
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance()-withdraw);
		System.out.println(withdraw+"원 출금 완료");
		
		
		
	}
	public static void deposit(){
		
		System.out.println("------------");
		System.out.println(" 입금");
		System.out.println("------------");
		
		System.out.println("계좌입력");
		String Acnumber = sc.next();
		System.out.println("입금금액");
		int deposit = sc.nextInt();
		
		
		Account account = check(Acnumber);
		if(account == null) { 
			System.out.println("계좌 없음");
			return;
		}
		account.setBalance(account.getBalance()+deposit);
		System.out.println(deposit+"원 입금 완료");
		
		
		
	}
	public static Account check(String AcNumber){
		
		Account account = null;

		for (int i=0;i<arrayaccount.length;i++) {
			if(arrayaccount[i]!=null) {
				if(arrayaccount[i].getAcNumber().equals(AcNumber)) {
					// ** if(arrayaccount[i].getAcNumber()==AcNumber) 이라고 쓰면 안됨
					account = arrayaccount[i];
					break;
				}
			}
	
		}
		return account;
	}

}

