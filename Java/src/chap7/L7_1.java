package chap7;

public class L7_1 {

	static int med( int a, int b, int c) {
		int med = a;
		if (a < b && a > c) med = a;
		else if (b < a && b > c) med = b;
		else if (c < a && c > b) med = c;
		else if (a > b && a < c) med = a;
		else if (b > a && b < c) med = b;
		else if (c > a && c < b) med = c;
		return med;
	}

	static int min( int a, int b, int c) {
		int min = a;
		if (b < min) min = b;
		if (c < min) min = c;
		return min;
	}

	static int signOf(int n) {
		int ret = 0;
		if (n < 0) {
			ret = -1;
		}
		else if (n > 0) {
			ret = 1;
		}
		return ret;
	}

	public static void main(String[] args) {
		int param = -10;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));
		param = 0;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));
		param = 10;
		System.out.println("引数=" + param + ",戻り値=" + signOf(param));

		int param1 = 10, param2 = 2, param3 = 9;
		System.out.println("\nmin()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + min(param1, param2, param3));

		param1 = 10;param2 = 2;param3 = 9;
		System.out.println("\nmed()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + med(param1, param2, param3));
		param1 = 2;param2 = 10;param3 = 9;
		System.out.println("med()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + med(param1, param2, param3));
		param1 = 9;param2 = 10;param3 = 2;
		System.out.println("med()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + med(param1, param2, param3));
		param1 = 2;param2 = 9;param3 = 10;
		System.out.println("med()引数=" + param1 + "," + param2 + "," + param3 + ",戻り値=" + med(param1, param2, param3));
	}
}
