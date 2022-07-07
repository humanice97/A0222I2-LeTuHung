package phone_manage;

public abstract class Phone {
    public static int count = 1;
    private int id;
    private String name;
    private double price;
    private String company;

    public Phone(String name, double price, String company) {
        this.id = count++;
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
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                '}';
    }
    public String makeText(){
        return "id = " + getId() + ", name = " + getName() + ", price = " + getPrice() + ", company = " + getCompany();
    }
}
