package chap6;

import java.util.ArrayList;
import java.util.Scanner;

public class PointSumAveArrayList2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		int ninzu;
		ArrayList<Integer> tensu = new ArrayList<Integer>();

		System.out.print("何人入れますか?");
		ninzu = stdIn.nextInt();

		System.out.println(ninzu + "人の点数を入力せよ。");

		for (int i = 0; i < ninzu; i++) {
			System.out.print((i + 1) + "番の点数:");
			tensu.add(stdIn.nextInt());
			sum += tensu.get(i);
		}
		stdIn.close();

		System.out.println("合計は" + sum + "点です。");
		System.out.println("平均は" + (double) sum / ninzu + "点です。");
	}
}
