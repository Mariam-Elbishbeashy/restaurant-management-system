
package restaurantSystem;

public class Receptionist extends User {
   
    private String employeeId;
    private Reservation reservation;
    public Receptionist(){
        
    }
    public Receptionist(String username, String password, String employeeId){
        super(username, password);
        this.employeeId = employeeId;
    }
    public void createReservation(){
        
    }
    public void cancelReservation(){
        
    }
    public void addOrderMealsToReservation(){
      
    }
    public void selectCategoryTable(){
        
    }
    public double viewCalculatePayment(){
        return reservation.getOrder().calculateTotalPayment();
    }
    
}
