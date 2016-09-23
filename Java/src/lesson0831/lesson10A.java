package lesson0831;
import java.util.Scanner;

public class lesson10A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner stdIn = new Scanner(System.in);

		int x; // 整数１
		int y; // 整数２
		int z; // 偶数(1)・奇数(2)を選択
		int t; // ２値交換用
		int sum = 0; // 合計値加算用

		System.out.print("整数１を入力＞");
		x = stdIn.nextInt();
		System.out.print("整数２を入力＞");
		y = stdIn.nextInt();
		System.out.print("偶数(1)・奇数(2)を選択＞");
		z = stdIn.nextInt();

		// ２値の交換（小さい値～大きい値の順に計算するため）
		if (x > y) {
			t = x; // 値を退避
			x = y;
			y = t;
		}

		switch (z) {
		case 1:
			System.out.print(x + "から" + y + "までの偶数の合計は");
			if (x % 2 == 0) { 		// Xが偶数（偶数開始）の時
				for (int i = x; i <= y; i += 2) {
					sum += i;
				}
			} else { 				// Xが奇数（奇数開始）の時
				for (int i = x + 1; i <= y; i += 2) {
					sum += i;
				}
			}
			System.out.print(sum);	//コンソール画面に演算結果を出力
			break;					//switch文を抜ける
		case 2:
			System.out.print(x + "から" + y + "までの奇数の合計は");
			if (x % 2 == 1) {		// Xが奇数（奇数開始）の時
				for (int i = x; i <= y; i += 2) {
					sum += i;
				}
			} else {				// Xが偶数（偶数開始）の時
				for (int i = x + 1; i <= y; i += 2) {
					sum += i;
				}
			}
			System.out.print(sum);	//コンソール画面に演算結果を出力
			break;					//switch文を抜ける
		}
		stdIn.close();
	}
}