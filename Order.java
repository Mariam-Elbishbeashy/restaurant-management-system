package restaurantSystem;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;

public class Order {
    private LocalDateTime orderDate;
    private Guest guest;
    private String orderId;
    private LinkedHashMap<Integer, List<Meal>> order;
    private static int numOfOrders; 

    public Order() {
       
    }
    public Order(LocalDateTime orderDate, Guest guest, LinkedHashMap<Integer, List<Meal>> order) {
        this.orderDate = orderDate;
        this.guest = guest;
        this.order = order;

        numOfOrders++;
    }

    public double calculateTotalPayment() {
       return 0.0;
    }
}
