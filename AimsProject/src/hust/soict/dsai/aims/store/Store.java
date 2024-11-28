package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	public ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	private int count = 0;
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
		count++;
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		int j = 0;
		for (int i = 0; i< count; i ++) {
			if (dvd.getTitle().equals(itemsInStore.get(i).getTitle())) {
				j= i;
				break;
			}
		}
		itemsInStore.remove(j);
		count--;
		
	}
	
}
