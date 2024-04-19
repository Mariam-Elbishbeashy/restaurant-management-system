package restaurantSystem;

import java.util.List;

public interface FileHandler<T> {
    public List<Meal> loadMenuFromFile(String filePath);
    public void saveMenuToFile(List<Meal> data, String filePath);
    public void saveUsersToFile(List<User> data, String filePath);
    public List<User> loadUsersFromFile(String filePath);
    public void saveReceiptToFile(List<Receipt> data, String filePath);
    public List<Receipt> loadReceiptsFromFile(String filePath);
  
}
