/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

/**
 *
 * @author ASUS
 */


public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        // Test addDVD
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        store.addDVD(dvd1);
        System.out.println("Added DVD: " + dvd1.getTitle());
        System.out.println("Items in store: " + store.getItemsInStore().size());

        // Test removeDVD
        store.removeDVD(dvd1);
        System.out.println("Removed DVD: " + dvd1.getTitle());
        System.out.println("Items in store: " + store.getItemsInStore().size());
    }
}