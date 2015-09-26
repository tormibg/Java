package _1lvShop.products.electronics;

import _1lvShop.products.AgeRestriction;

public class Computer extends ElectonicsProduct{

    private static final int PCGUARANTEE = 24;
    private static final int MAXDISCOUNT = 1000;

    public Computer(String name, double price, long quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, PCGUARANTEE);
    }

    @Override
    public double getPrice() {
        if (this.getQuantity() > MAXDISCOUNT) {
            return this.getPriceOfProduct() * 0.95;
        }

        return super.getPriceOfProduct();
    }
}
