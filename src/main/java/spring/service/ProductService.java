package spring.service;

import org.springframework.stereotype.Service;
import spring.model.Product;

import javax.annotation.PostConstruct;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new LinkedList<>();

    public List<Product> printAll() {
        for (Product product: products) {
            System.out.println(product.getId() + " " + product.getTitle() + " " +product.getCost());
        }
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Product findByTitle(String title) {
        for (Product product : products) {
            if (title.equals(product.getTitle())) {
                return product;
            }
        }
        return null;
    }

    @PostConstruct
    private void productService() {
        products.add(new Product((long) 1, "Pepsi", 200.15f));
        products.add(new Product((long) 2, "Sprite", 200.5f));
        products.add(new Product((long) 1, "Rich cola", 100.15f));
        products.add(new Product((long) 2, "Rich tonic", 100.15f));
        products.add(new Product((long) 1, "Frustyle",100.15f));
        products.add(new Product((long) 2, "Mojito", 100.15f));
        products.add(new Product((long) 1, "Fantola", 50.15f));
        products.add(new Product((long) 2, "Street", 50.15f));
        products.add(new Product((long) 1, "Dobriy", 50.15f));
        products.add(new Product((long) 2, "Tarxyn", 50.15f));
    }

}
