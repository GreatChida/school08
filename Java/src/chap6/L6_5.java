package chap6;

import java.util.Scanner;

public class L6_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数:");
		int count = stdIn.nextInt();
		int[] array = new int[count];

		for (int i = 0; i < array.length; i++) {
			System.out.print("a[" + i + "] = ");
			array[i] = stdIn.nextInt();
		}
		stdIn.close();

		System.out.print("a = {");
		int i = 0;
		for (; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[i] + "}");
	}
}
