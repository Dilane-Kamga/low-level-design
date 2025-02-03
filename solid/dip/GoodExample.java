// 🔹 Good Example – Use dependency injection with an interface:

interface Database {
	void connect();
}

class MySQLDatabase implements Database {
	public void connect() { System.out.println("Connected to MySQL."); }
}

class PostgreSQLDatabase implements Database {
	public void connect() { System.out.println("Connected to PostgreSQL."); }
}

class DataService {
	private Database db;

	public DataService(Database db) {  // Inject dependency
		this.db = db;
	}

	public void getData() {
		db.connect();
		System.out.println("Fetching data...");
	}
}

// ✅ Fix: Now, DataService doesn’t care which database is used!