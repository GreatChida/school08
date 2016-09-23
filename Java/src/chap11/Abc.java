package chap11;

class Chap11 {

}

public class Abc {
	public static int count = 0;

	void print() {
		System.out.println(chap11.Def.name);
	}
}

class Def {
	public static String name = "お名前";

	void print() {
		System.out.println(chap11.Abc.count);
	}
}