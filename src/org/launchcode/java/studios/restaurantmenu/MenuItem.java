package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private Double price;
    private String description;
    public String category;
    public Boolean newItem = false;

    public MenuItem(String category, String description, Double price) {
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public MenuItem(String category, String description, Double price, Boolean newItem) {
        this.category = category;
        this.description = description;
        this.price = price;
        this.newItem = newItem;
    }

    public void printMenuItem() {
        System.out.println(this.description);
    }

    @Override
    public String toString() {
        return description + " $" + price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getNewItem() {
        return newItem;
    }

    public void setNewItem(Boolean newItem) {
        this.newItem = newItem;
    }
}
