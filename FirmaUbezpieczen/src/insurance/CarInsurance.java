package insurance;

public class CarInsurance extends Insurance{
    private String fortuneValue;

    public CarInsurance(String name, String duration, int price, int compensation, String fortuneValue) {
        super(name, duration, price, compensation);
        this.fortuneValue = fortuneValue;
    }

    public String getFortuneValue() {
        return fortuneValue;
    }

    public void setFortuneValue(String fortuneValue) {
        this.fortuneValue = fortuneValue;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + getName() +
                ", duration='" + getDuration() +
                ", price=" + getPrice() +
                ", compensation=" + getCompensation() +
                ", fortuneValue=" +  fortuneValue+
                '}';
    }
}
