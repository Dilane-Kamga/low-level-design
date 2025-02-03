// 🔹 Good Example – Separate responsibilities into two classes:

class Report {
	String content;

	public Report(String content) {
		this.content = content;
	}

	public void generateReport() {
		System.out.println("Generating Report: " + content);
	}
}

class ReportSaver {
	public void saveToFile(Report report, String filename) {
		System.out.println("Saving report to file: " + filename);
	}
}

// ✅ Fix: Now, Report only generates reports, and ReportSaver handles saving.