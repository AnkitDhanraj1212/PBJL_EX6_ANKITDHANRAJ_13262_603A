package PBJL_EX6_ANKITDHANRAJ_13262_603A;

import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}
public class PartC{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 55000),
            new Product(2, "Smartphone", 25000),
            new Product(3, "Tablet", 15000),
            new Product(4, "Headphones", 3000),
            new Product(5, "Smartwatch", 8000)
        );

        System.out.println("Products priced above 10000, sorted by price:");
        products.stream()
                .filter(p -> p.price > 10000)
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        System.out.println("\nProducts sorted by name:");
        products.stream()
                .sorted(Comparator.comparing(p -> p.name))
                .forEach(System.out::println);

        System.out.println("\nProduct names only:");
        products.stream()
                .map(p -> p.name)
                .forEach(System.out::println);
    }
}