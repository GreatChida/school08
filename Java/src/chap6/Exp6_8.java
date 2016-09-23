package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exp6_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();

		System.out.print("要素数は:");
		int count = stdIn.nextInt();

		for (int i=0;i<count; i++ ){
			System.out.print("数値(" + i + ")は:");
			a.add(stdIn.nextInt());
		}
		int sum = 0;
		for (int data : a) {
			sum += data;
		}
		System.out.println("合計値は" + sum);
		System.out.println("平均値は" + sum / count);
	}
}
