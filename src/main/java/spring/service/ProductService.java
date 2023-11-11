package spring.service;

import org.springframework.stereotype.Service;
import spring.model.Product;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new LinkedList<>();

    public void printAll() {
        System.out.println("ID " + "TITLE " + "PRICE");
        for (Product product: products) {
            System.out.println(product.getId() + " " + product.getTitle() + " " +product.getCost());
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void findByTitle(String title) {
        for (Product product : products) {
            if (title.equals(product.getTitle())) {
                System.out.println("ID " + "TITLE " + "PRICE");
                System.out.println(product.getId() + " " + product.getTitle() + " " +product.getCost());
            }
        }
    }

    @PostConstruct
    private void productService() {
        products.add(new Product((long) 1, "Pepsi", 200.15f));
        products.add(new Product((long) 2, "Sprite", 200.5f));
        products.add(new Product((long) 3, "Rich cola", 100.15f));
        products.add(new Product((long) 4, "Rich tonic", 100.15f));
        products.add(new Product((long) 5, "Frustyle",100.15f));
        products.add(new Product((long) 6, "Mojito", 100.15f));
        products.add(new Product((long) 7, "Fantola", 50.15f));
        products.add(new Product((long) 8, "Street", 50.15f));
        products.add(new Product((long) 9, "Dobriy", 50.15f));
        products.add(new Product((long) 10, "Tarxyn", 50.15f));
    }

}
