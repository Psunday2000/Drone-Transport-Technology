import com.fasterxml.jackson.databind.ObjectMapper;

public class DroneMapper {
    ObjectMapper mapper = new ObjectMapper();
    File jsonFile = new File("drone.json");
    Drone drone = mapper.readValue(jsonFile, Drone.class);

}
