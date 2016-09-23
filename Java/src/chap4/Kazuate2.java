package chap4;

import java.util.Random;
import java.util.Scanner;

public class Kazuate2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);

		System.out.println("数当てゲーム開始!!");
		System.out.println("0～99の数を当ててください。");

		int count=1; // 問題数を数えるカウンタ
		int x;
		while (true) {
			System.out.println("いくつかな:");
			x = stdIn.nextInt();

			if( x == no ) {
				System.out.println("正解です。");
				break;
			} else if (x>no){
				System.out.println("もっと小さな数だよ。");
			} else if (x<no) {
				System.out.println("もっと大きな数だよ。");
			}
			if (count==3) {
				System.out.println("残念。3回以内に答えられませんでした。");
				break;
			}
			count++;
		}
		stdIn.close(); // stdInを閉じる
	}
}
