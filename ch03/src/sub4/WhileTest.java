package sub4;
/*
 * 날짜: 24/7/1
 * 이름: 김소진
 * 내용: 반복문 while 실습
 */
public class WhileTest {

	public static void main(String[] args) {

		//1~10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		System.out.println("sum: " +sum);
		//do~while
		int total = 0;
		int j=1;
		do {
			j++;
			if(j %2 ==0) {
				total+=j;
				
			}
			
		}while(j<=10);
		System.out.println("1~10까지 짝수의 합: " + total);
		//break
		int num = 1;
		while(true) {
			
			if(num % 5==0 && num % 7 ==0) {
				break;
			}
			num++;
		}
		System.out.println("5와 7의 최소공배수: " + num);
		//continue
		int tot = 0;
		int i = 0; 
		

		while(i <= 10) {
			i++;
			if(i % 1==1) {
				continue;
			}
			tot += i;
		}
		System.out.println("1~10까지 짝수 합: " + tot);
	}

}
