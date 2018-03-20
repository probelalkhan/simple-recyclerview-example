package net.simplifiedcoding.recyclerviewexample;

/**
 * Created by Belal on 3/18/2018.
 */

public class Product {

    private String image;
    private String title, shortdesc;
    private double price;
    private double rating;

    public Product(){

    }

    public Product(String image, String title, String shortDesc, double price, double rating) {
        this.image = image;
        this.title = title;
        this.shortdesc = shortDesc;
        this.price = price;
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
