package restaurantSystem;

import java.time.LocalDateTime;
import java.io.*;   
import java.util.*;

public class Admin extends User implements FileHandler<T> {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private List<Order> orders;
    private List<User> users;
    private LinkedHashMap<String, List<Meal>> menu;
    private LinkedHashMap<String, List<Table>> tables;
    private List<Reservation> reservations;
    
    public Admin() {
        this.menu = new LinkedHashMap<>();
        this.users = new ArrayList<>();
    }

   
    public void viewReservationsPerReceptionist() {
        // Implementation goes here
    }

    public void receptionistWithMaxReservations() {
        // Implementation goes here
    }

    public void receptionistWithMaxRevenue() {
        // Implementation goes here
    }

    public void viewReservationsPerGuest() {
        // Implementation goes here
    }

    public Guest guestWithMaxReservations() {
        // Implementation goes here
        return null; // Replace with actual result
    }

    public Guest guestWithMaxRevenue() {
        // Implementation goes here
        return null; // Replace with actual result
    }

    public double calculateAverageRevenueReservation(LocalDateTime startTime, LocalDateTime endTime) {
        // Implementation goes here
        return 0.0; // Placeholder value, replace with actual calculation
    }

    public double calculateTotalRevenueReservation(LocalDateTime startTime, LocalDateTime endTime) {
        // Implementation goes here
        return 0.0; // Placeholder value, replace with actual calculation
    }

    // Reservation details, meal, table, and order-related methods
    public void viewReservationDetails() {
        // Implementation goes here
    }

    public void mostReservedTable(LocalDateTime startDate, LocalDateTime endDate, String tableCategory) {
        // Implementation goes here
    }

    public void mostRevenueTable(LocalDateTime startDate, LocalDateTime endDate, String tableCategory) {
        // Implementation goes here
    }

    public List<Table> searchTableByCategory(List<Table> tables, String tableCategory) {
        // Implementation goes here
        return null; // Replace with actual result
    }

    public void mostOrderedMeal(LocalDateTime startDate, LocalDateTime endDate, String mealCategory) {
        // Implementation goes here
    }

    // Report-related methods
    public void viewUserReport() {
        // Implementation goes here
    }

    public void viewTableReport() {
        // Implementation goes here
    }

    public void viewMenuReport() {
        
       if (menu.isEmpty()){
           System.out.println("Menu is empty");
       }
       else{
           for(Map.Entry<String , List<Meal>> e : menu.entrySet()){
               System.out.println("The menu report:");
               String category = e.getKey();
               List<Meal> mealCategory = e.getValue();
               System.out.println("category: "+ category);
               for(Meal meal: mealCategory){
                   System.out.println(" " + meal);
               }
           }
       }
    }

    public void addMealToMenu(String category, Meal meal) 
    {
        menu.putIfAbsent(category, new ArrayList<>());      
        menu.get(category).add(meal);
        saveMenuToFile(getAllMeals(), "menu.txt");
        System.out.println("Meal added to the menu under category '" + category + "': " + meal);
    }

    public void removeMealFromMenu(String category, Meal meal)
    {
        List<Meal> mealCategory = menu.get(category);
        if (mealCategory != null){
            if(mealCategory.remove(meal)){
                 System.out.println("Meal removed from the menu under category '" + category + "': " + meal);
            } 
            else {
                System.out.println("Meal not found in the menu under category '" + category + "'");
            }
        }else {
            System.out.println("Category '" + category + "' not found in the menu.");  
        }
        saveMenuToFile(getAllMeals(), "menu.txt"); 
    }

    public void editMealInMenu(String oldCategory, Meal oldMeal, String newCategory, Meal newMeal)  
    {
        removeMealFromMenu(oldCategory, oldMeal);
        addMealToMenu(newCategory, newMeal);
        saveMenuToFile(getAllMeals(), "menu.txt"); 
        System.out.println("Meal edited in the menu: "+ newMeal);      
    }
    
    public List<Meal> searchMealByName(String keyword)
    {
       List<Meal> result = new ArrayList<>();
       for(List<Meal> mealCategory : menu.values()){
           for(Meal meal :mealCategory){
               if(meal.getMealName().contains(keyword)){
                   result.add(meal);
               }
           }
       }
       return result;
    }
    public List<Meal> searchMealByCategory(String mealCategory) 
    {
        return menu.getOrDefault(mealCategory, new ArrayList<>());
    }
    
    public List<Meal> getAllMeals(){
        List<Meal> allMeals = new ArrayList<>();
        for(List<Meal> meals : menu.values()){
            allMeals.addAll(meals);        
        }
        return allMeals;
    }
    @Override
    public void saveMenuToFile(List<Meal> data, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Meal meal : data) {
                writer.println(meal.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Meal> loadMenuFromFile(String filePath) {
        List<Meal> loadedMenu = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader(filePath))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String mealName = parts[0].trim();

                // Read the price directly as a double
                double priceMeal = 0.0;
                if (parts.length > 1) {
                    priceMeal = scanner.nextDouble();
                } else {
                    System.out.println("Error: Missing price information in line: " + line);
                    continue;  // Skip this line if there's an issue with parsing the price
                }

                String mealCategory = parts[2].trim();
                loadedMenu.add(new Meal(mealName, priceMeal, mealCategory));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
        return loadedMenu;
    }
    
    @Override
    public void saveUsersToFile(List<User> data, String filePath){
        
    }
    @Override
    public List<User> loadUsersFromFile(String filePath){
        return null;
    }
    @Override
    public void saveReceiptToFile(List<Receipt> data, String filePath){
         
    }
    @Override
    public List<Receipt> loadReceiptsFromFile(String filePath){
         return null;
    }

    public void addUser(User user) {
        // Implementation goes here
    }

    public void removeUser(User user) {
        // Implementation goes here
    }

    public void editUser(User user) {
        // Implementation goes here
    }

    public void searchUser(User user) {
        // Implementation goes here
    }

    // Table-related methods
    public void addTable(Table table) {
        // Implementation goes here
    }

    public void editTable(Table table) {
        // Implementation goes here
    }

    public void removeTable(Table table) {
        // Implementation goes here
    }

    // Order-related methods
    public void numOfOrder(LocalDateTime startDate, LocalDateTime endDate) {
        // Implementation goes here
    }
  
}
