package chap6;

import java.util.ArrayList;

public class ArrayListSumForIn {

	public static void main(String[] args) {
		ArrayList<Double> a = new ArrayList<Double>();

		for (int i=0; i<a.size(); i++ ) {
			System.out.println("a.get(" + i + ") = " + a.get(i));
		}
		double sum = 0;
		for (double i : a) {
			sum += i;
		}
		System.out.println("全要素の和は" + sum +"です。");
	}
}
