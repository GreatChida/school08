package lesson0923;

public class Dog extends Animal {
	private String name;

	Dog(int age, String name) {
		super(age);
		this.name = name;
	}

	void say() {
		System.out.println(age + "才の" + name + "が鳴きました");
	}
}
