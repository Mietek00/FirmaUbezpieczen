package people;

public class People {
    private String name;
    private String address;
    private String phoneNumber;
    private boolean isWorker;

    public People(String name, String address, String phoneNumber, boolean isWorker) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isWorker = isWorker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isWorker() {
        return isWorker;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", isWorker=" + isWorker +
                '}';
    }
}
