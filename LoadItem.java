public class LoadItem {
    private String name;
    private long weight;
    private boolean fragile;
    private String image;

    public LoadItem(String name, long weight, boolean fragile, String image) {
        this.name = name;
        this.weight = weight;
        this.fragile = fragile;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
