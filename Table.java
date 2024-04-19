
package restaurantSystem;
import java.time.LocalDateTime;

public class Table {
    private String tableId;
    private String tableCategory;
    private int capacity;
    private boolean isReserved;
    private LocalDateTime startDate;
    private LocalDateTime endTime;
    
    public Table(){
        
    }
    
    public Table(String tableId, String tableCategory, int capacity, boolean isReserved,
                 LocalDateTime startDate, LocalDateTime endTime) {
        this.tableId = tableId;
        this.tableCategory = tableCategory;
        this.capacity = capacity;
        this.isReserved = isReserved;
        this.startDate = startDate;
        this.endTime = endTime;
    } 
    
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableCategory() {
        return tableCategory;
    }

    public void setTableCategory(String tableCategory) {
        this.tableCategory = tableCategory;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isIsReserved() {
        return isReserved;
    }

    public void setIsReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
