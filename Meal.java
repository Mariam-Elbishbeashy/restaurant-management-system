
package restaurantSystem;


public class Meal {
   private String mealName;
   private String mealCategory;
   private double priceMeal;

   public Meal(){
       
   }
   
    public Meal(String mealName, double priceMeal,  String mealCategory) {
        this.mealName = mealName;
        this.mealCategory = mealCategory;
        this.priceMeal = priceMeal;   
    }
    
    @Override
    public String toString() {
        return mealName + "," + priceMeal + "," + mealCategory;
    }
    
     public void updatePrice(double newPrice){
       
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getMealCategory() {
        return mealCategory;
    }

    public void setMealCategory(String mealCategory) {
        this.mealCategory = mealCategory;
    }
   
    public double getPriceMeal() {
        return priceMeal;
    }

    public void setPriceMeal(double priceMeal) {
        this.priceMeal = priceMeal;
    } 
}
