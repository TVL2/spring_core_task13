package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.model.Product;
import spring.service.OrderService;

@Configuration
@ComponentScan("spring")
public class Config {

    @Bean("orderService")
    OrderService orderService() {
        OrderService orderService = new OrderService();
        orderService.cart.add(new Product((long) 1, "Pepsi", 200.15f));
        orderService.cart.add(new Product((long) 2, "Sprite", 200.15f));
        orderService.cart.add(new Product((long) 1, "Rich cola", 100.15f));
        orderService.cart.add(new Product((long) 2, "Rich tonic", 100.15f));
        orderService.cart.add(new Product((long) 1, "Frustyle",100.15f));
        orderService.cart.add(new Product((long) 2, "Mojito", 100.15f));
        orderService.cart.add(new Product((long) 1, "Fantola", 50.15f));
        orderService.cart.add(new Product((long) 2, "Street", 50.15f));
        orderService.cart.add(new Product((long) 1, "Dobriy", 50.15f));
        orderService.cart.add(new Product((long) 2, "Tarxyn", 50.15f));
        return orderService;
    }


}
