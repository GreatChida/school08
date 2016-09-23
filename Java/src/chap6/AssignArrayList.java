package chap6;

import java.util.Arrays;
import java.util.List;

public class AssignArrayList {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,2,3,4,5);
		List<Integer> b = Arrays.asList(6,5,4,3,2,1,0);

		System.out.println("a = "+a);
		System.out.println("b = "+b);

		b = a;
		a.set(0, 10);

		System.out.println("aをbに代入しました。");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
