package sub1;

/*
 * 날짜: 24/7/2
 * 이름: 김소진
 * 내용: 배열 실습
 */
public class ArrayTest {

	public static void main(String[] args) {

		//배열
		int arr1[] = {1,2,3,4,5};
		char arr2[] = {'A','B','C'};
		String arr3[] = {"서울","대전","대구","부산","광주"};
		//배열 원소
		//배열의 인덱스로 배열 값 참조
		System.out.println("arr1의 1번째:" + arr1[0]);
		System.out.println("arr1의 2번째:" + arr1[1]);
		System.out.println("arr1의 3번째:" + arr1[2]);
		System.out.println();
		System.out.println("arr2의 1번째:" + arr2[0]);
		System.out.println("arr2의 2번째:" + arr2[1]);
		System.out.println();
		System.out.println("arr3의 1번째:" + arr3[0]);
		System.out.println("arr3의 2번째:" + arr3[1]);
		System.out.println();
		//배열 길이
		//배열 원소 갯수
		System.out.println("arr1의 길이:" + arr1.length);
		System.out.println("arr2의 길이:" + arr1.length);
		System.out.println("arr3의 길이:" + arr3.length);
		System.out.println();
		//배열 반복문
		for(int i = 0; i< arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		for(char ch : arr2) {
			System.out.print(ch + " ");
		}
		System.out.println();
		for(String str : arr3) {
			System.out.print(str + " ");
		}
		//1차원 배열
		int scores []= {80,60,78,62,92};  //배열명은 복수형으로 네이밍
		int total = 0;
		for(int score : scores) {
			total += score;
		}
		System.out.println();
		System.out.println("scores 배열의 총합: " + total);
		System.out.println();
		//2차원 배열
		int arr2d[][]= {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}};
		for(int a=0; a< 3; a++) {
			for(int b=0; b< 4; b++) {
				
				System.out.println("arr2d["+a+"][" + b+"]" + arr2d[a][b]);
			}
		}
		//3차원 배열
		int arr3d [][][] = {{{1,2,3},
							{4,5,6},
							{7,8,9}},
							{{10,11,12},
							{13,14,15},
							{16,17,18}},
							{{19,20,21},
							{22,23,24},
							{25,26,27}}};
		
		for(int a=0; a<3; a++) {
			for(int b=0; b<3; b++) {
				for(int c=0; c<3; c++) {
					System.out.printf("arr3d[%d][%d][%d] : %d\n", a,b,b, arr3d[a][b][c] );
				}
			}
		}
	}

}
