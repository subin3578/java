package Test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {

	public static void main(String[] args) {
		
		for(int count =1;count<=5;count++) {
			System.out.println(makeLotto());
		}
	}

	private static Set makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) {
			//랜덤식에 괄호 안치면 값 안나옴 ********
			int num = (int) (Math.random()*45)+1;
			lottoSet.add(num);
			if(lottoSet.size()>6) {
				break;
			}
		}
	
		Set<Integer> treeSet = new TreeSet<>(lottoSet);	
		
		return treeSet;
	}
}
	
	
