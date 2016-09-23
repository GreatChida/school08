package chap5;

import java.util.Scanner;

public class L5_5 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x, y, z;
		System.out.print("変数x:");
		x = stdIn.nextInt();
		System.out.print("変数y:");
		y = stdIn.nextInt();
		System.out.print("変数z:");
		z = stdIn.nextInt();
		stdIn.close();

		int sum = x + y + z;
		double ave = (double)sum / 3;
		System.out.println("合計=" + sum + " 平均=" + ave);
	}
}
