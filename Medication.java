import com.fasterxml.jackson.databind.ObjectMapper;

public class Medication {
    private String medName;
    private String medCode;
    private String image;

    public Medication() { }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public String getMedCode() {
        return medCode;
    }

    public void setMedCode(String medCode) {
        this.medCode = medCode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}