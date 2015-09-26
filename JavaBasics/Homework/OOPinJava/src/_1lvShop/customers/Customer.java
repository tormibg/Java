package _1lvShop.customers;

public class Customer {
    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance) {
        this.setName(name);
        this.setAge(age);
        this.setBalance(balance);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age <= 5) {
            throw new IllegalArgumentException("ame must be > 5");
        }
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
