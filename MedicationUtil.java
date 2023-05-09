import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class MedicationUtil {
    public static List<Medication> readMedicationFromJson(String jsonFile) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Medication>> typeReference = new TypeReference<List<Medication>>(){};
        List<Medication> medications = mapper.readValue(new File(jsonFile), typeReference);
        return medications;
    }
}
