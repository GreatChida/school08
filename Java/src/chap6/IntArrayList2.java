package chap6;

import java.util.ArrayList;

public class IntArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			a.add(100+i);//i + 1);
		}

		for (int i = 0; i < a.size(); i++) {
			System.out.println("a.get(" + i + ")=" + a.get(i));
		}
	}
}
