package chap6;

public class Exercise {

	public static void main(String[] args) {
		double d = 1.1;
		double f = 2.2;

		int sum = (int) (d + f);
		int mul = (int) (d * f);

		System.out.printf("足し算の結果=%d\n", sum);
		System.out.printf("掛け算の結果=%d\n", mul);
	}
}
