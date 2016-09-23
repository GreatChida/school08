package chap6;

public class IntArray1 {

	public static void main(String[] args) {
		int[] a = new int[5];

		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;

		int[] b = a;
		System.out.println("a[" + 0 + "] = " + b[0]);
		System.out.println("a[" + 1 + "] = " + b[1]);
		System.out.println("a[" + 2 + "] = " + b[2]);
		System.out.println("a[" + 3 + "] = " + b[3]);
		System.out.println("a[" + 4 + "] = " + b[4]);

		System.out.println("a="+a);
		System.out.println("a="+a.hashCode());
	}
}
