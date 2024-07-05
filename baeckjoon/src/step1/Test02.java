package step1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		//1330
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		String result= (a > b) ? ">" : ((a < b) ? "<" : "==");
//		System.out.println(result);
	
		//9498
		int score = sc.nextInt();
		 if(90 <= score && score <= 100) {
			 System.out.println("A");
		}else if(79 < score) {
			System.out.println("B");
		}else if(69 < score) {
			System.out.println("C");
		}else {
			System.out.println("F");
		}
		
		 //2753
		 int year = sc.nextInt();
		 String result = ((year % 4==0) ? ((year % 100==0)?"1": (year%400==0) ? "0":"1"):"0");  
	
		 //14681
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 
		 if(x>0&&y>0) {
			 System.out.println("1사분면");
		 }else if(x<0&&y>0) {
			 System.out.println("2사분면");
		 }else if(x<0&&y<0) {
			 System.out.println("3사분면");
		 }else if(x>0&&y<0) {
			 System.out.println("4사분면");
		 }
	
		 
		 if(x>0) {
			 if(y>0) {
				 System.out.println("1사분면");
			 }else {
				 System.out.println("4사분면");
			 }
		 }
		 if(x<0) {
			 if(y>0) {
				 System.out.println("2사분면");
			 }else {
				 System.out.println("3사분면");
			 }
		 }
	
		 //2884
		 int H = sc.nextInt();
		 int M = sc.nextInt();
		 if(H<24) {
			 if(M>45) {
			 System.out.println(H + M-45);
		 }else {
			 System.out.println((H-1) + (M+60-45));
		 }
		 }
		 
	
	}
		
		

}
