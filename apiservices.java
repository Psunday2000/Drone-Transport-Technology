import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/drones")
public class apiservices {

    @PostMapping("/register")
    public Drone registerDrone(@RequestBody Drone drone) {
        // Code to register a new drone
    }

    @PutMapping("/{id}/load")
    public Drone loadDrone(@PathVariable Long id, @RequestBody LoadItem loadItem) {
        // Code to load an item onto a specific drone
    }

    @GetMapping("/{id}/items")
    public List<LoadItem> getLoadedItems(@PathVariable Long id) {
        // Code to retrieve the items loaded onto a specific drone
    }

    @GetMapping("/available")
    public List<Drone> getAvailableDrones() {
        // Code to retrieve a list of available drones
    }

    @GetMapping("/{id}/battery")
    public int getDroneBattery(@PathVariable Long id) {
        // Code to retrieve the battery level of a specific drone
    }
    public static void main() {
        System.out.println("Hello, this dispatch. Select an option so that I can help you");
        System.out.println("1: Register a Drone /t 2:Load Drone /t 3:Get Loaded Items /t 4:Check Available Drone /t 5:Check Battery Level /t 0:Exit");
        int opt;
        if (opt == 1);{
            registerDrone();
        }
        else if (opt == 2);
    }
}
