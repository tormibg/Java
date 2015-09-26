package _1lvShop.products.electronics;

import _1lvShop.products.AgeRestriction;

public class Appliance extends ElectonicsProduct{
    private static final int APPGUARANTEE = 6;
    private static final int MAXEXTRACHARGE = 50;

    public Appliance(String name, double price, long quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, APPGUARANTEE);
    }

    @Override
    public double getPrice() {
        if (this.getQuantity() < MAXEXTRACHARGE) {

            return this.getPriceOfProduct() * 1.05;
        }

        return super.getPriceOfProduct();
    }
}
