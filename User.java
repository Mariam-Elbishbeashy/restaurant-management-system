
package restaurantSystem;

public class User implements UserType {
    private String userName;
    private String password;
    private int userType;
    
    public User(){
        
    }
    public User(String userName,String password){
        this.userName = userName;
        this.password = password;
    }
    public User(int userType){
        this.userType = userType;
    }

    public int getUserType() {
        return userType;
    }
    
    public void login(){
        
    }
    public void logout(){
        
    }
}
