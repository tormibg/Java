package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

import static java.lang.System.out;

class Product1 implements Comparable<Product1> {
    private String name;
    private BigDecimal price;

    public Product1(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public BigDecimal getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", this.price, this.name);
    }

    @Override
    public int compareTo(Product1 o) {
        return this.price.compareTo(o.price);
    }
}

public class OrderOfProducts {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/com/company/InputProductsToOrder.txt");
        //FileReader fileReader = new FileReader("src/com/company/InputProducts2.txt");
        try {
            Scanner scanIn = new Scanner(fileReader);
            List<Product1> products = new ArrayList<Product1>();

            while (scanIn.hasNextLine()) {
                String inputStr = scanIn.nextLine();
                //String[] arrStr = Arrays.asList(inputStr.split("\\s+")).stream().toArray(String[]::new);
                String[] arrStr = inputStr.split(" ", -1);
                Product1 p1 = new Product1(arrStr[0], new BigDecimal(arrStr[1]));
                products.add(p1);
            }
            scanIn.close();
            fileReader.close();

            fileReader = new FileReader("src/com/company/Orders1.txt");
            scanIn = new Scanner(fileReader);

            List<String> ordersStr = new ArrayList<String>();
            BigDecimal sumOfOrders = new BigDecimal(0);

            while (scanIn.hasNextLine()) {
                String inputStr = scanIn.nextLine();
                String[] arrStr = Arrays.asList(inputStr.split("\\s+")).stream().toArray(String[]::new);
                    for (Product1 product : products) {
                        if (product.getName().equals(arrStr[1])){
                            BigDecimal quant = new BigDecimal(arrStr[0]);
                            BigDecimal curPrice = (product.getPrice()).multiply(quant);
                            sumOfOrders = sumOfOrders.add(curPrice);
                        }
                }
            }
            out.println(sumOfOrders);
            //Collections.sort(products);
            writeToFile(sumOfOrders);

        } catch (FileNotFoundException ex) {
            out.println("Input file not read");
        } finally {
            fileReader.close();
        }
    }

    private static void writeToFile(BigDecimal suma) {
        File fileToWrite = new File("src/com/company/outputOrder.txt");
        try {
            fileToWrite.createNewFile();
            FileWriter fileWriter = new FileWriter(fileToWrite);

                fileWriter.write(String.valueOf(suma + "\n"));

            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            out.println("Creating file error ");
        }
    }
}
