package com.example.searchfunction;

import java.util.Arrays;
import java.util.Comparator;

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(targetName);

            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return null;
    }

    public static void main(String[] args) {
        // Sample Product Array
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Smartphone", "Electronics"),
            new Product(3, "Shoes", "Fashion"),
            new Product(4, "Book", "Education"),
            new Product(5, "Backpack", "Accessories")
        };

        // Linear Search
        System.out.println("🔍 Linear Search for 'Book':");
        Product linearResult = linearSearch(products, "Book");
        System.out.println(linearResult != null ? linearResult : "Product not found");

        // Sort array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        // Binary Search
        System.out.println("\n🔍 Binary Search for 'Book':");
        Product binaryResult = binarySearch(products, "Book");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
    }
}
