package chap6;

import java.util.ArrayList;

public class L902_2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i <= 10; i++) {
			a.add(i);
		}
		for ( int i=0; i<a.size();i++) {
			System.out.println("a.get(" + i + ")=" + a.get(i));
		}
	}
}
