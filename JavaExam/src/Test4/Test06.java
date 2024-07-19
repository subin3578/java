package Test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
	
		printList(createList());
	}
	
	
	
	private static void printList(List list) {
		int total = 0;
		int size = list.size();
		
		for(int i=0;i<size;i++) {
			int score = (int) list.get(i);
			total += score;
			
			System.out.print(score);
			
			if(i==size -1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		System.out.print(total);
			
		}



	private static List createList() {
	
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		for(int i =1;i<=10;i++) {
			int num = rand.nextInt(41)+60;
			scoreList.add(num);
		}
		return scoreList;
		
	}
	
}


