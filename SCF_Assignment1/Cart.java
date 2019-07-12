package scfs1assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	/**
	 * List items is for list of available items List bag is for selected items
	 * from the list of available items
	 * hello the party is overr
	 */
	private static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> items = new ArrayList<Product>();
	static ArrayList<Product> bag = new ArrayList<Product>();

	static Product nike = new Product("nike", 2500);
	static Product puma = new Product("puma", 1500);
	static Product bata = new Product("bata", 3500);
	static Product asics = new Product("asics", 2700);
	static Product adidas = new Product("adidas", 3000);

	public static void main(String args[]) {

		items.add(nike);
		items.add(puma);
		items.add(bata);
		items.add(asics);
		items.add(adidas);

		int choice = 0;
		do {
			System.out
					.println("Enter Selection:\n 1: Add To Bag\n 2: Update Bag\n 3: View Bag\n 4: Generate Bill \n 0: Exit");
			choice = sc.nextInt();
			if (choice == 1) {
				addToBag();

			}

			if (choice == 2) {
				updateBag();
			}
			if (choice == 3) {
				viewBag();
			}
			if (choice == 4) {
				generateBill();
			}
			if (choice == 0) {
				System.exit(0);
			}

		} while (choice != 0);

	}

	private static void generateBill() {
		System.out.println("Invoice");
		System.out.println("*******");
		System.out.println("Name\t\t\tQuantity\t\tPrice Per Piece\t\tCost");
		double total = 0;
		for (Product value : bag) {
			total = total + (value.productQuantity * value.productPrice);
			System.out.println(value.productName + "\t\t\t"
					+ value.productQuantity + "\t\t\t" + value.productPrice
					+ "\t\t\t" + value.productPrice * value.productQuantity);
		}
		System.out.println("*****************************************");
		System.out.println("\t\tTotal : " + total);

	}

	private static void viewBag() {
		System.out.println(" Products In Bag");
		System.out.println("*****************");
		System.out.println("Name\t\t\tQuantity\t\tPrice");
		for (Product value : bag) {
			System.out.println(value.productName + "\t\t\t"
					+ value.productQuantity + "\t\t\t" + value.productPrice);
		}

	}

	private static void updateBag() {
		System.out.println("Enter Product name");
		String bagItem = sc.next();
		if ("nike".equalsIgnoreCase(bagItem) && bag.contains(nike)) {
			System.out.println("Enter Quntity");
			int qty = sc.nextInt();
			if (qty <= 0) {
				bag.remove(nike);
			} else
				nike.productQuantity = qty;
		} else if ("puma".equalsIgnoreCase(bagItem) && bag.contains(puma)) {
			System.out.println("Enter Quntity");
			int qty = sc.nextInt();
			if (qty <= 0) {
				bag.remove(puma);
			} else
				puma.productQuantity = qty;
		} else if ("bata".equalsIgnoreCase(bagItem) && bag.contains(bata)) {
			System.out.println("Enter Quntity");
			int qty = sc.nextInt();
			if (qty <= 0) {
				bag.remove(bata);
			} else
				bata.productQuantity = qty;
		} else if ("asics".equalsIgnoreCase(bagItem) && bag.contains(asics)) {
			System.out.println("Enter Quntity");
			int qty = sc.nextInt();
			if (qty <= 0) {
				bag.remove(asics);
			} else
				asics.productQuantity = qty;
		} else if ("adidas".equalsIgnoreCase(bagItem) && bag.contains(adidas)) {
			System.out.println("Enter Quntity");
			int qty = sc.nextInt();
			if (qty <= 0) {
				bag.remove(adidas);
			} else
				adidas.productQuantity = qty;
		} else
			System.out.println("Item not available in bag");

	}

	/**
	 * addToBag display a list of items item to be added to bag are selected
	 * using corresponding index
	 * 
	 * @param subchoice
	 *            is used for selecting index of item
	 * @param qty
	 *            gets the value of quantity of the item and should be grater
	 *            then or equal to 1
	 * 
	 */
	private static void addToBag() {
		System.out
				.println("List of Items \n 1: Nike\n 2: Puma\n 3: bata\n 4: Asics\n 5: Adidas ");
		int subchoice = sc.nextInt();
		if (subchoice == 1) {
			if (bag.contains(nike)) {
				System.out.println("Item Alredy Available in The Cart");
			} else {
				System.out.println("Enter Quntity");
				int qty = sc.nextInt();
				if (qty >= 0) {
					nike.productQuantity = qty;
					bag.add(nike);
				}
			}

		}
		if (subchoice == 2) {
			if (bag.contains(puma)) {
				System.out.println("Item Alredy Available in The Cart");
			} else {

				System.out.println("Enter Quntity");
				int qty = sc.nextInt();
				if (qty >= 0) {
					bag.add(puma);
					puma.productQuantity = qty;
				}
			}

		}
		if (subchoice == 3) {
			if (bag.contains(bata)) {
				System.out.println("Item Alredy Available in The Cart");
			} else {
				System.out.println("Enter Quntity");
				int qty = sc.nextInt();
				if (qty >= 0) {
					bag.add(bata);
					bata.productQuantity = qty;
				}
			}

		}
		if (subchoice == 4) {
			if (bag.contains(asics)) {
				System.out.println("Item Alredy Available in The Cart");
			} else {
				System.out.println("Enter Quntity");
				int qty = sc.nextInt();
				if (qty >= 0) {
					bag.add(asics);
					asics.productQuantity = qty;
				}
			}

		}
		if (subchoice == 5) {
			if (bag.contains(adidas)) {
				System.out.println("Item Alredy Available in The Cart");
			} else {
				System.out.println("Enter Quntity");
				int qty = sc.nextInt();
				if (qty >= 0) {
					bag.add(adidas);
					adidas.productQuantity = qty;
				}
			}
		}
	}

}
