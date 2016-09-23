package chap8;

public class Student {
	private String firstname;
	private String lastname;
	private int age;
	private String msg;

	public Student(String name, int age, String msg) {
		super();
		this.firstname = name;
		this.age = age;
		this.msg = msg;
	}

	public String getName() {
		return firstname;
	}

	public int getAge() {
		return age;
	}

	public String getMsg() {
		return msg;
	}
}
