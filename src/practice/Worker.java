package practice;

public interface Worker {
	void work();
}

class Employee {
	public void work() {
		System.out.println("work");
	}

}


class Checker implements Worker {
	public void work() {
		System.out.println("work");
	}
	public void report() {
		System.out.println("work");
	}
}

class Kaikeishi extends Checker {
	public void create() {
		System.out.println("create future");
	}
}


