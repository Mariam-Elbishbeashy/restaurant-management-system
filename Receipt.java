
package restaurantSystem;

import java.time.LocalDateTime;

public class Receipt {
    private String receiptId;
    private Order order;
    private LocalDateTime paymentTime;
    private String paymentInfo;
    
    public Receipt() {

    }

    public Receipt(String receiptId, Order order, LocalDateTime paymentTime, String paymentInfo) {
        this.receiptId = receiptId;
        this.order = order;
        this.paymentTime = paymentTime;
        this.paymentInfo = paymentInfo;
    }
            
}
