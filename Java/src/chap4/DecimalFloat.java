package chap4;

import java.util.Scanner;

public class DecimalFloat {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数x:");
		int x = 53;//stdIn.nextInt();

		System.out.print("実数y:");
		double y = 53.2f;//stdIn.nextDouble();

		System.out.printf("\nx =%3d%% y =%15.5f\n", x, y);
		stdIn.close();
	}
}
