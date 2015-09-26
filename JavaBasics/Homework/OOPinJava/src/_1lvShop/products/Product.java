package _1lvShop.products;

import _1lvShop.interfaces.Buyable;

public abstract class Product implements Buyable{
    private String name;
    private double price;
    private long quantity;
    private AgeRestriction ageRestriction;

    public Product(String name, double price, long quantity, AgeRestriction ageRestriction) {
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
        this.setAgeRestriction(ageRestriction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        this.name = name;
    }

    protected double getPriceOfProduct() {
        return this.price;
    }

    @Override
    public abstract double getPrice();

    public void setPrice(double price) {

        if (price <= 0) {
            throw new IllegalArgumentException("Price cannot be negative or zero.");
        }
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {

        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be of negative value.");
        }
        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {

        if (!AgeRestriction.isMember(ageRestriction.toString())) {
            throw new IllegalArgumentException("Invalid ageRestriction specified.");
        }
        this.ageRestriction = ageRestriction;
    }
    @Override
    public String toString() {
        return String.format("Product: name = '%s', price = $%.2f, quantity = %d, age restriction = %s",
                this.getName(), this.getPrice(), this.getQuantity(), this.getAgeRestriction());
    }

    public void decreaseQuantityByOne() {
        this.setQuantity(1);
    }
}
