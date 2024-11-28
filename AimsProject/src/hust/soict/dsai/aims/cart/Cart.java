package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] =
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added.");
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if (qtyOrdered + dvdList.length <= MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < dvdList.length; i++) {
				itemsOrdered[qtyOrdered] = dvdList[i];
				qtyOrdered ++;
				System.out.println("The disc has been added.");
			}
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered + 2 <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered ++;
			System.out.println("The disc has been added.");
			itemsOrdered[qtyOrdered] = dvd2;
			qtyOrdered ++;
			System.out.println("The disc has been added.");
		} else {
			System.out.println("The cart is full.");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
					for (int j = i; j < qtyOrdered - 1; j++) {
						itemsOrdered[j] = itemsOrdered[j + 1];
					}
					qtyOrdered--;
					System.out.println("The disc has been removed.");
					return;
				}
			}
			System.out.println("The disc is not in the cart.");
		} else {
			System.out.println("The cart is empty.");
		}
	}
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void print(int id) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].getId() == id) {
					System.out.println(itemsOrdered[i].toString());
					return;
				}
			}
			System.out.println("The disc is not in the cart.");
		} else {
			System.out.println("The cart is empty.");
		}
	}
	
	public void print(String title) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemsOrdered[i].isMatch(title)) {
					System.out.println(itemsOrdered[i].toString());
					return;
				}
			}
			System.out.println("The disc is not in the cart.");
		} else {
			System.out.println("The cart is empty.");
		}
	}
	
}
