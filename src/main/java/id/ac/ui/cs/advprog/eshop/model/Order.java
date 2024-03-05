package id.ac.ui.cs.advprog.eshop.model;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
public class Order {
    String id;
    List<Product> products;
    Long orderTime;
    String author;
    @Setter
    String status;

    Order (String id, List<Product> products, Long orderTime, String author) {
    }

    Order (String id, List<Product> products, Long orderTime, String author, String status) {
    }
}

