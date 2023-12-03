package insurance;

public class PeopleInsurance extends Insurance{
    private String amountOfPeople;

    public PeopleInsurance(String name, String duration, int price, int compensation, String amountOfPeople) {
        super(name, duration, price, compensation);
        this.amountOfPeople = amountOfPeople;
    }

    public String getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(String amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + getName() +
                ", duration='" + getDuration() +
                ", price=" + getPrice() +
                ", compensation=" + getCompensation() +
                ", amountOfPeople=" + amountOfPeople +
                '}';
    }
}
