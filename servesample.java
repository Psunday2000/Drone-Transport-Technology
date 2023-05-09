import java.util.Scanner;
public class servesample {

    public static void registerDrone() {
        // Code to register a new drone
        System.out.println("Registering Drone............");
        System.out.println("Drone Registered");
    }

    public static void loadItem() {
        // Code to Load Item
        System.out.println("Loading Drone............");
        System.out.println("Drone Loaded");
    }

    public static void getLoadList() {
        // Code to get loaded items on drone
        System.out.println("Getting Loaded Items on Drone ............");
        System.out.println("Items.........");
    }

    public static void checkAvail() {
        // Code to check load availability
        System.out.println("Checking Available Drone............");
        System.out.println("Available Drones.......");
    }

    public static void checkBatLevel() {
        // Code to check drone battery level
        System.out.println("Getting Battery Level for Drone ............");
        System.out.println("Battery Level is 100%");
    }

    public static void exit() {
        // Code to exit API
        System.out.println("Thank You. Exiting Programme......");
        System.exit(0);
    }

    public static void main(String[]args) {
        Scanner option = new Scanner(System.in);
        System.out.println("Hello, this dispatch. Select an option so that I can help you");
        System.out.println("1: Register a Drone /t 2:Load Drone /t 3:Get Loaded Items /t 4:Check Available Drone /t 5:Check Battery Level /t 0:Exit");
        int opt = option.nextInt();
        
        if (opt == 0){
            exit();
        } else if (opt == 1){
            registerDrone();
        } else if (opt == 2){
            loadItem();
        } else if (opt == 3){
            getLoadList();
        } else if (opt == 4){
            checkAvail();
        } else if (opt == 5){
            checkBatLevel();
        } else if (opt >= 6) {
            System.out.println("Invalid option! Kindly select an option so that I can help you");
            System.out.println("1: Register a Drone /t 2:Load Drone /t 3:Get Loaded Items /t 4:Check Available Drone /t 5:Check Battery Level /t 0:Exit");
        }
    }
}
