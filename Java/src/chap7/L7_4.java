package chap7;

import java.util.Scanner;

public class L7_4 {

	static int sumUp(int n){
		int sum=n;
		while( n-- > 0){
			sum += n;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("数nは:");
		int n = stdIn.nextInt();

		System.out.println(n + "までの整数の和=" + sumUp(n));
	}
}
