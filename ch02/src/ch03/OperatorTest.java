package ch03;
/*
 * 날짜:2024/06/28
 * 이름: 김소진
 * 내용: 연산자 실습하기
 */
public class OperatorTest {

	public static void main(String[] args) {

		//산술연산자
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		int num4 = 4;
		
		int result1 = num1 + num2;
		int result2 = num1 - num2;
		int result3 = num1 * num2;
		int result4 = num1 / num2;
		int result5 = num1 % num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		//증감연산자
		int num = 0;
		num++;
		++num;
		System.out.println(num);
		
		num--;
		--num;
		System.out.println(num);
		//복합연산자
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		n1 += 1;
		n2 -=2;
		n3 *=3;
		n4 /= 4;
		 
		 System.out.println(n1);
		 System.out.println(n2);
		 System.out.println(n3);
		 System.out.println(n4);
		
		//비교연산자
		int var1 = 1;
		int var2 = 2;

		boolean rs1 = var1 > var2; 
		boolean rs2 = var1 < var2; 
		boolean rs3 = var1 >= var2; 
		boolean rs4 = var1 <= var2; 
		boolean rs5 = var1 == var2; 
		boolean rs6 = var1 != var2;
		
		System.out.println(rs1);
		System.out.println(rs2);
		System.out.println(rs3);
		System.out.println(rs4);
		System.out.println(rs5);
		System.out.println(rs6);
		
		//논리연산자
		int var3 = 3;
		int var4 = 3;
		
		boolean res1 = (var3 > 3) && (var4 > 3);
		boolean res2 = (var3 > 2) && (var4 > 3);
		boolean res3 = (var3 > 3) || (var4 > 3);
		boolean res4 = (var3 > 3) || (var4 > 5);
		boolean res5 = !(var3 > var4);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
		System.out.println(res5);
		 
		int arr[];
		int i = 0;
		arr = new int[10];
		arr[0]=0;
		arr[1]= 1;
		while(i<8) {
			arr[i+2]=arr[i+1]+arr[i];
			i++;
		}
		System.out.println(arr[9]);
				
		
		
		
	}

}
