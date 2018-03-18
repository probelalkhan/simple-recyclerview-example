package net.simplifiedcoding.recyclerviewexample;

/**
 * Created by Belal on 3/18/2018.
 */

public class Product {

    private int image;
    private String title, shortDesc, rating;
    private double price;

    public Product(int image, String title, String shortDesc, String rating, double price) {
        this.image = image;
        this.title = title;
        this.shortDesc = shortDesc;
        this.rating = rating;
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }
}
