package restaurantSystem;
import java.time.LocalDateTime;

public class Reservation {
    private String reservationId;
    private Guest guest;
    private LocalDateTime date;
    private Table table;
    private static int numOfReservation;
    private boolean isCancelled;
    private Order order;
    private int Rating;

    public int getRating() {
        return Rating;
    }

    public void setRating(int Rating) {
        this.Rating = Rating;
    }

    public Reservation(){
       
    }
    public Reservation(String reservationId, LocalDateTime date, boolean isCancelled){
        this.reservationId = reservationId;
        this.date = date;
        this.isCancelled = isCancelled;
    }

    // Constructor with all parameters
    public Reservation(String reservationId, Guest guest, LocalDateTime date, Table table,
                       boolean isCancelled, Order order){
        this.reservationId = reservationId;
        this.guest = guest;
        this.date = date;
        this.table = table;
        this.isCancelled = isCancelled;
        this.order = order;

        // Increment the static counter for the number of reservations
        numOfReservation++;
    }
    
    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public static int getNumOfReservation() {
        return numOfReservation;
    }

    public static void setNumOfReservation(int numOfReservation) {
        Reservation.numOfReservation = numOfReservation;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
