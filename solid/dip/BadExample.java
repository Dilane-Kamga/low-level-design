// 🔹 Bad Example – High-level code directly depends on low-level details:

class MySQLDatabase {
	public void connect() { System.out.println("Connected to MySQL."); }
}

class DataService {
	private MySQLDatabase db;

	public DataService() {
		this.db = new MySQLDatabase();  // Direct dependency
	}

	public void getData() {
		db.connect();
		System.out.println("Fetching data...");
	}
}


// ❌ Problem: DataService is tightly coupled to MySQLDatabase. What if we want to switch to PostgreSQL?