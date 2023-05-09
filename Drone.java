import java.util.List;

public class Drone<LoadItem> {
    private long serialNum;
    private String model;
    private long weightLimit = 500;
    private int batteryPercentage;
    private List<LoadItem> items;
    private boolean available;
   
    public Drone(long serialNum, String model, int batteryPercentage) {
        this.serialNum = serialNum;
        this.model = model;
        this.batteryPercentage = batteryPercentage;
        this.items = new ArrayList<>();
        this.available = true;
    }
    
    public long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getWeightLimit() {
        return weightLimit;
    }

    public int getBatteryPercentage() {
        return batteryPercentage;
    }

    public void setBatteryPercentage(int batteryPercentage) {
        this.batteryPercentage = batteryPercentage;
    }

    public List<LoadItem> getItems() {
        return items;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean register() {
        // Register the drone 
        // return true if registration is successful, false otherwise
    }
    
    public boolean load(LoadItem item) {
        if(!isAvailable()) {
            System.out.println("Drone is not available for loading");
            return false;
        }
        if(items.size() > 0 && weightLimit < item.getWeight()) {
            System.out.println("Cannot load item, exceeds weight limit");
            return false;
        }
        items.add(item);
        return true;
    }
    
    public boolean unload(LoadItem item) {
        if(!isAvailable()) {
            System.out.println("Drone is not available for unloading");
            return false;
        }
        if(!items.contains(item)) {
            System.out.println("Item not found in drone's load");
            return false;
        }
        items.remove(item);
        return true;
    }
    
    public boolean checkBattery() {
        if(batteryPercentage < 25) {
            System.out.println("Battery level is low, please recharge");
            return false;
        }
        return true;
    }
}
        