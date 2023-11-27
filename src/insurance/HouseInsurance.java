package insurance;

public class HouseInsurance extends Insurance {
    private String houseValue;

    public HouseInsurance(String name, String duration, int price, int compensation, String houseValue) {
        super(name, duration, price, compensation);
        this.houseValue = houseValue;
    }

    public String getHouseValue() {
        return houseValue;
    }

    public void setHouseValue(String houseValue) {
        this.houseValue = houseValue;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + getName() + '\'' +
                ", duration='" + getDuration() + '\'' +
                ", price=" + getPrice() +
                ", compensation=" + getCompensation() +
                "houseValue=" + houseValue +
                '}';
    }
}
