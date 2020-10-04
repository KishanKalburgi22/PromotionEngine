package promotion.engine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PromotionEngine {
	public static int TotalAmount = 0;
	private static Map<String, Integer> unitPrice = new HashMap<>();
	private static Map<String, String> promotions = new HashMap<>();
	private static List<String> items = new ArrayList<>();

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
		String[] input = new String[total];
		for (int i = 0; i < total; i++) {
			input[i] = sc.next();
			String quantity = input[i].split("-")[0];
			String item = input[i].split("-")[1];
			for (int j = 0; j < Integer.parseInt(quantity); j++) {
				items.add(item);
			}
		}
		calTotal(items);

		System.out.println("The Total Amount after discount is - " + TotalAmount);
		items.clear();

	}

	private static void calTotal(List<String> items) {
		for (String k : promotions.keySet()) {
			String q = promotions.get(k).split("-")[0];
			String d = promotions.get(k).split("-")[2];
			if (k.length() == 1) {
				int count = Collections.frequency(items, k);
				TotalAmount += (count / Integer.parseInt(q)) * Integer.parseInt(d);
				TotalAmount += (count % Integer.parseInt(q)) * unitPrice.get(k);
			} else {
				char[] arr = k.toCharArray();
				int c1 = Collections.frequency(items, String.valueOf(arr[0]));
				int c2 = Collections.frequency(items, String.valueOf(arr[1]));
				if (c1 >= c2) {
					TotalAmount += (c1 - (c1 - c2)) * Integer.parseInt(d);
					TotalAmount += (c1 - c2) * unitPrice.get(String.valueOf(arr[0]));
				} else {
					TotalAmount += (c2 - (c2 - c1)) * Integer.parseInt(d);
					TotalAmount += (c2 - c1) * unitPrice.get(String.valueOf(arr[1]));
				}
			}
		}
	}

}
