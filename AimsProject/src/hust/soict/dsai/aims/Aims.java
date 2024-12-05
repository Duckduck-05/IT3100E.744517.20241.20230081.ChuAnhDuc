package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		
		// Create a new cart
		Cart cart = new Cart();

		// Create a new DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		cart.addDigitalVideoDisc(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		cart.addDigitalVideoDisc(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", 
				"Animation", "John Musker", 90, 18.99f);
		cart.addDigitalVideoDisc(dvd3);

//		System.out.println("Total cost: " + cart.totalCost());
		

        System.out.println(dvd1.toString());
        System.out.println(dvd2.toString());
	}
}
