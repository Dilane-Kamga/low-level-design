// 🔹 Bad Example – A class that requires modification for every new discount type:

class DiscountCalculator {
	public double calculateDiscount(String type, double price) {
		if (type.equals("NEW_YEAR")) {
			return price * 0.10;
		} else if (type.equals("BLACK_FRIDAY")) {
			return price * 0.20;
		} else {
			return 0;
		}
	}
}

// ❌ Problem: Every time we add a new discount type, we modify DiscountCalculator, violating OCP.