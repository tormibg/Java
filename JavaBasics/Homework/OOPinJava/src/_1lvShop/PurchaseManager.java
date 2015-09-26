package _1lvShop;

import _1lvShop.customers.Customer;
import _1lvShop.interfaces.Expirable;
import _1lvShop.products.AgeRestriction;
import _1lvShop.products.Product;

import java.util.Date;

public class PurchaseManager {

    private PurchaseManager() {
    }

    public static void processPurchase(Product product, Customer customer) {
        if (product == null || customer == null) {
            throw new NullPointerException("Customer, product or both cannot be null.");
        }

        if (product.getQuantity() <= 0) {
            throw new IllegalArgumentException("The product is out of stock");
        }

        if (product instanceof Expirable) {
            Expirable foodProduct = (Expirable) product;
            if (foodProduct.getExpirationDate().before(new Date())) {
                throw new IllegalArgumentException("Product has been expired.");
            }
        }

        if (customer.getBalance() < product.getPrice()) {
            throw new IllegalArgumentException("You do not have enough money to buy this product!");
        }

        if (product.getAgeRestriction() == AgeRestriction.Adult && customer.getAge() < 18) {
            throw new IllegalArgumentException("You are too young to buy this product!");
        }

        product.decreaseQuantityByOne();
        customer.setBalance(customer.getBalance() - product.getPrice());
    }

}
