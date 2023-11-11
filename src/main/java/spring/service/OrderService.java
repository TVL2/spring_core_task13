package spring.service;

import spring.model.Cart;
import spring.model.Product;


public class OrderService {

    public Cart cart = new Cart();

    public void order() {
        Float sum = 0.0f;
        for (Product product : cart.getProducts()) {
            sum += product.getCost();
            System.out.println(product.getTitle());
        }
        System.out.println("----------");
        System.out.println(String.format("%.2f", sum));
    }
}
