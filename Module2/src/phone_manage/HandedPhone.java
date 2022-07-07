package phone_manage;

public class HandedPhone extends Phone {
    private String country;
    private String status;

    public HandedPhone(String name, double price, String company, String country, String status) {
        super(name, price, company);
        this.country = country;
        this.status = status;
    }

    public HandedPhone() {
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandedPhone{" + makeText() +
                ", country= '" + country + '\'' +
                ", status= '" + status + '\'' +
                "} ";
    }
}
