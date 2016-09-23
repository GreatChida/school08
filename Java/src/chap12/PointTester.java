package chap12;

import java.util.ArrayList;

public class PointTester {

	public static void main(String[] args) {
		Point2D a = new Point2D(10, 15);
		Point3D b = new Point3D(20, 30, 40);

		System.out.printf("a = (%d, %d)\n", a.getX(), a.getY());
		System.out.printf("b = (%d, %d, %d)\n",
					b.getX(), b.getY(), b.getZ());

		Object obj = a;
		Object obj2 = new Point2D(10,11);
		Object obj3 = new Point3D(10,11,12);
		ArrayList<Integer> aaa = new ArrayList<Integer>();
		Object obj4 = aaa;
		((ArrayList<Integer>)obj4).add(11);
	}
}
