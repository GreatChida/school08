package chap5;

import java.util.Scanner;

public class L5_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		float x;
		double y;

		System.out.print("x:");
		x = stdIn.nextFloat();
		System.out.print("y:");
		y = stdIn.nextDouble();

		// System.out.println("x = " + x);
		// System.out.println("y = " + y);
		int i = Float.floatToIntBits(x);
		System.out.printf("%f ( %08X )\n", x, i);
		long l = Double.doubleToLongBits(y);
		System.out.printf("%f ( %016X )\n", y, l);

		float f = 0.1f;
		double d = .1e-5;

		long ii = 1234_5678_9012_3456L;
		System.out.println("ii="+ ii);

		stdIn.close();
	}

}
