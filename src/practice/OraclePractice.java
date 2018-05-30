package practice;

public class OraclePractice {
	public static void main(String[] args) {
		Worker worker = new Enginner();
		worker.work();
	}
}

class A {
	String val = "A";
	void print() {
		System.out.println(val);
	}
}

class B extends A {
	String val ="B";
}