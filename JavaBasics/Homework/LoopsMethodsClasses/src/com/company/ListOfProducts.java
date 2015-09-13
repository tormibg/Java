package com.company;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

import static java.lang.System.out;

class Product implements Comparable<Product> {
    private String name;
    private BigDecimal price;

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", this.price, this.name);
    }

    @Override
    public int compareTo(Product o) {
        return this.price.compareTo(o.price);
    }
}

public class ListOfProducts {
    public static void main(String[] args) throws IOException {
        //FileReader fileReader = new FileReader("src/com/company/InputProducts.txt");
        FileReader fileReader = new FileReader("src/com/company/InputProducts2.txt");
        try {
            Scanner scanIn = new Scanner(fileReader);
            List<Product> products = new ArrayList<Product>();

            while (scanIn.hasNextLine()) {
                String inputStr = scanIn.nextLine();
                String[] arrStr = Arrays.asList(inputStr.split("\\s+")).stream().toArray(String[]::new);
                Product p1 = new Product(arrStr[0], new BigDecimal(arrStr[1]));
                products.add(p1);
            }
            scanIn.close();
            fileReader.close();
            Collections.sort(products);
            writeToFile(products);

        } catch (FileNotFoundException ex) {
            out.println("Input file not read");
        } finally {
            fileReader.close();
        }
    }

    private static void writeToFile(List<Product> products) {
        File fileToWrite = new File("src/com/company/outputProducts.txt");
        try {
            fileToWrite.createNewFile();
            FileWriter fileWriter = new FileWriter(fileToWrite);
            for (Product product : products) {
                out.println(product);
                fileWriter.write(String.valueOf(product + "\n"));
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            out.println("Creating file error ");
        }
    }
}
