// 🔹 Good Example – Split the interface into smaller, focused interfaces:

interface Workable {
	void work();
}

interface Eatable {
	void eat();
}

class Developer implements Workable, Eatable {
	public void work() { System.out.println("Writing code..."); }
	public void eat() { System.out.println("Eating lunch..."); }
}

class RobotWorker implements Workable {
	public void work() { System.out.println("Assembling products..."); }
}


// ✅ Fix: Now, RobotWorker doesn’t need an eat() method.