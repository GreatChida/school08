package chap5;

import java.util.Scanner;

public class L5_4 {

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
		double ave = sum / 3d;
		System.out.println("合計=" + sum + " 平均=" + ave);
	}
}
