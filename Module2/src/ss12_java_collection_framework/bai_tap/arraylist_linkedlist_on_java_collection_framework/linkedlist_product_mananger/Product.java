package ss12_java_collection_framework.bai_tap.arraylist_linkedlist_on_java_collection_framework.linkedlist_product_mananger;

public class Product {
    public static int count = 1;
    private String name;
    private int id;
    private double price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.id = count++;
        this.price = price;
    }


    @Override
    public String toString() {
        return "PRODUCT{" +
                "NAME='" + name + '\'' +
                ", ID='" + id + '\'' +
                ", PRICE=" + price +
                '}';
    }


}
