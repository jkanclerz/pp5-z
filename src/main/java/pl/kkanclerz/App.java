package pl.kkanclerz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.kkanclerz.greetings.Greeter;
import pl.kkanclerz.productcatalog.DatabaseProductStorage;
import pl.kkanclerz.productcatalog.ProductCatalog;
import pl.kkanclerz.productcatalog.InMemoryProductStorage;
import pl.kkanclerz.productcatalog.ProductStorage;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        Greeter greeter = new Greeter();
        System.out.println(greeter.hello("Kuba"));
    }

    @Bean
    Greeter createGreater() {
        return new Greeter();
    }

    @Bean
    ProductCatalog createCatalog(ProductStorage productStorage) {
        return new ProductCatalog(productStorage);
    }

    @Bean
    ProductStorage provideProductStorate() {
        return crateproductStoage();
    }

    DatabaseProductStorage createDbProductSotrage() {
        return new DatabaseProductStorage();
    }

    InMemoryProductStorage crateproductStoage() {
        return new InMemoryProductStorage();
    }
}
