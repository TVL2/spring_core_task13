package spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.service.OrderService;
import spring.service.ProductService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        context.getBean("productService", ProductService.class).printAll();
        context.getBean("orderService", OrderService.class).order();
        context.getBean("productService", ProductService.class).findByTitle("Sprite");
    }
}
