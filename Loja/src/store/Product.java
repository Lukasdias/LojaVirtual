/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Lukas Dias
 */
public class Product {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the availableAmount
     */
    public int getAvailableAmount() {
        return availableAmount;
    }

    /**
     * @param availableAmount the availableAmount to set
     */
    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
    }
    
    private String name;
    private double price;
    private String category;
    private int availableAmount;
    
    public Product(String name, double price, String category, int amount){
        this.name = name;
        this.price = price;
        this.category = category;
        this.availableAmount = amount;
        
    }
}
