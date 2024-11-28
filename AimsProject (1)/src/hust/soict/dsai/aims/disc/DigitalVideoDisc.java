/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hust.soict.dsai.aims.disc;

/**
 *
 * @author ASUS
 */
public class DigitalVideoDisc {
    private String title; 
    private String category; 
    private String director; 
    private int length; 
    private float cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    
    /* 
    public boolean isMatch(String title) {
        return this.title.equalsIgnoreCase(title);
    }*/
    public boolean isMatch(String title) {
        return this.title.equals(title);
    }

    @Override
    public String toString() {
        return "DVD [" + title + "] - [" + category + "] - [" 
                + director + "] - [" + length + "] : [" + cost + "$]";
    }
}