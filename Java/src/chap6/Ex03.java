package chap6;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);a.add(2);a.add(3);a.add(4);a.add(5);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(1);b.add(2);b.add(3);b.add(4);b.add(5);
//		int[] a = { 1, 2, 3, 4, 5 };
//		int[] b = { 1, 2, 3, 4, 5 };

		a = b;
		b.set(0, 0);
		b.set(1, 0);
		if (a == b) {
			System.out.println("一致");
		} else {
			System.out.println("不一致");
		}
		System.out.println("aのハッシュ値="+a.hashCode());
		System.out.println("bのハッシュ値="+b.hashCode());

		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
