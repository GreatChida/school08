package chap12;

class Point3D extends Point2D {
	int z;

	Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	void print(){
		System.out.println(super.x);
		System.out.println(this.z);
	}
	int getZ() {
		return z;
	}

	void setZ(int z) {
		this.z = z;
	}
}
