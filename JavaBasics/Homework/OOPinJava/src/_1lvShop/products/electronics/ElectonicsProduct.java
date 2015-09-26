package _1lvShop.products.electronics;

import _1lvShop.products.AgeRestriction;
import _1lvShop.products.Product;

public abstract class ElectonicsProduct extends Product {
    private int guaranteePeriod;

    protected ElectonicsProduct(String name, double price, long quantity, AgeRestriction ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.setGuaranteePeriod(guaranteePeriod);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    protected void setGuaranteePeriod(int guaranteePeriod) {

        if (guaranteePeriod < 0) {
            throw new IllegalArgumentException("Guarantee cannot be a negative value.");
        }
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public abstract double getPrice();

    @Override
    public String toString() {
        return super.toString() + ", warranty = " + this.getGuaranteePeriod() + " months";
    }
}
