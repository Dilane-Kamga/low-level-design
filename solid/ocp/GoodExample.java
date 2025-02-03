// 🔹 Good Example – Use polymorphism to add new discounts without modifying existing code:

interface Discount {
	double apply(double price);
}

class NewYearDiscount implements Discount {
	public double apply(double price) {
		return price * 0.10;
	}
}

class BlackFridayDiscount implements Discount {
	public double apply(double price) {
		return price * 0.20;
	}
}

class DiscountCalculator {
	public double calculateDiscount(Discount discount, double price) {
		return discount.apply(price);
	}
}

// ✅ Fix: We can now add new discounts without modifying DiscountCalculator.