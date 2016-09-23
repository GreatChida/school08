package chap7;

public class Scope {

	static int x = 700;

	static void printX(){
		x = 100;
		System.out.println("x = " + x);
		return ;
	}

	public static void main(String[] args) {
		System.out.println("x = " + x);

		int x = 800;
		System.out.println("\nx = " + x);
		System.out.println("Scope.x = " + Scope.x);
		{
			int yy =0;

		}
		printX();
		System.out.println("x = " + x);
	}
}
