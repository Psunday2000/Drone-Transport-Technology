package com.droneproj.droneproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@RequestMapping("/api/v1/drones")
public class DroneprojApplication {

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
    
	public static void main(String[] args) {
		SpringApplication.run(DroneprojApplication.class, args);
	}