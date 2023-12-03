package insurance;

public class Insurance {
    private String name;
    private String duration;
    private int price;
    private int compensation;

    public Insurance(String name, String duration, int price, int compensation) {
        this.name = name;
        this.duration = duration;
        this.price = price;
        this.compensation = compensation;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public int getCompensation() {
        return compensation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCompensation(int compensation) {
        this.compensation = compensation;
    }

    public String toString() {
        return "Insurance{" +
                "name='" + name +
                ", duration='" + duration +
                ", price=" + price +
                ", compensation=" + compensation +
                '}';
    }
}
