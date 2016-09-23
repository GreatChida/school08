package chap10;

class Account2{
	//フィールド
	private String name;

	Account2(String name) {
		this.name = name;
	}

	Account2() {
	}

	//ゲッター
	String getName(){
		System.out.println("this="+this.hashCode());
		return name;
	}
}
public class SampleCar {

	public static void main(String[] args) {
		Account2 chida = new Account2();

		System.out.println("chida.hascode="+chida.hashCode());
		System.out.println(chida.getName());

	}
}
