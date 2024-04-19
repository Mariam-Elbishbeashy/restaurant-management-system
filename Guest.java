
package restaurantSystem;

import java.util.List;
import java.util.ArrayList;

public class Guest extends User{
    private List<Reservation> reservationHistory;
 
    public Guest(String username, String password) {
        super(username, password);
        this.reservationHistory = new ArrayList<>();
    }

    public void rateBooking(Reservation reservation , int rating)
    {
        if (reservation != null) {
            
            if (reservationHistory.contains(reservation)) {
                
                reservation.setRating(rating);
                System.out.println("Rating for the booking has been set to: " + rating);
            } else {
                System.out.println("You cannot rate a booking that is not in your history.");
            }
        } else {
            System.out.println("Invalid reservation provided.");
        }
    }
    public void viewReservationHistory(){
        
    }
    public void addReservationToHistory(Reservation reservation) {
        reservationHistory.add(reservation);
    }
}
