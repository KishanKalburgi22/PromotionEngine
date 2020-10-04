package promotion.engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PromotionEngine {
	public static int TotalAmount = 0;
	private static Map<String, Integer> unitPrice = new HashMap<>();
	private static Map<String, String> promotions = new HashMap<>();

	private static void init() {
		// Unit price SKU
		unitPrice.put("A", 50);
		unitPrice.put("B", 30);
		unitPrice.put("C", 20);
		unitPrice.put("D", 15);

		// Promotions
		promotions.put("A", "3-A-130");
		promotions.put("B", "2-B-45");
		promotions.put("CD", "1-CD-15");

	}

	public static void main(String[] args) {
		init();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of SKUs");

		int total = sc.nextInt();

		System.out.println("Enter the " + total + " input items in -> [item - quantity] format E.g 1-A");
		for (int i = 0; i < total; i++) {
			calTotal(sc.next());
		}
		System.out.println("The Total Amount after discount is - " + TotalAmount);
	}

	public static int calTotal(String input) {
		String quantity = input.split("-")[0];
		String item = input.split("-")[1];

		String q = promotions.get(item).split("-")[0];
		String d = promotions.get(item).split("-")[2];
		TotalAmount += (Integer.parseInt(quantity) / Integer.parseInt(q)) * Integer.parseInt(d);
		TotalAmount += (Integer.parseInt(quantity) % Integer.parseInt(q)) * unitPrice.get(item);

		return TotalAmount;
	}

}
