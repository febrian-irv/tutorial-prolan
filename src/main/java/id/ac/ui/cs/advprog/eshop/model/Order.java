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
    Status status;
    public enum Status {
        WAITING_PAYMENT("WAITING_PAYMENT"),
        FAILED("FAILED"),
        CANCELLED("CANCELLED"),
        SUCCESS("SUCCESS");

        public final String label;

        Status(String label) {
            this.label = label;
        }
    }

    Order (String id, List<Product> products, Long orderTime, String author) {
    }

    Order (String id, List<Product> products, Long orderTime, String author, String status) {
    }
}

