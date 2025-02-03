// 🔹 Bad Example – A single interface with too many unrelated methods:

interface Worker {
	void work();
	void eat();
}

class Developer implements Worker {
	public void work() {
		System.out.println("Writing code...");
	}

	public void eat() {
		System.out.println("Eating lunch...");
	}
}

// ❌ Problem: If we create a RobotWorker, it must implement eat(), even though robots don’t eat!