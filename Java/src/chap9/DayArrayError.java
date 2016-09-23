package chap9;

import java.util.Scanner;

public class DayArrayError {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };

		System.out.print("日付は何個:");
		int n = stdIn.nextInt();

		Day[] a = new Day[n];

		for (int i=0; i<a.length; i++) {
			a[i] = new Day();
			a[i].set(2017, 10, 15);
		}

		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "]="
					+a[i].getYear() + "年"
					+a[i].getMonth()+ "月"
					+a[i].getDate() + "日("
					+wd[a[i].dayOfWeek()] + ")" );
		}
		Day newday =  new Day(a[0]);

		System.out.println("newdayは" + newday + "です。");
		System.out.println(newday);
	}
}