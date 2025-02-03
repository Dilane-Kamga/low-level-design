// 🔹 Bad Example – A class that handles both report generation and file saving

class Report {
	String content;

	public Report(String content) {
		this.content = content;
	}

	public void generateReport() {
		System.out.println("Generating Report: " + content);
	}

	public void saveToFile(String filename) {
		System.out.println("Saving report to file: " + filename);
	}
}

// ❌ Problem: This class does two things – generates reports and handles file saving. If saving logic changes, we modify this class, violating SRP.
