package phone_manage.models;

public abstract class Phone {
    private int id;
    private String name;
    private double price;
    private String company;

    public Phone(int id, String name, double price, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public Phone() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'';
    }

    public String makeTexts() {
        return id + "," + name + "," + price + "," + company;
    }
}

