package spring.model;

import java.util.LinkedList;
import java.util.List;


public class Cart {


    private List<Product> products = new LinkedList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}