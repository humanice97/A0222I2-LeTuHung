package phone_manage;

public class GenuinePhone extends Phone {
    private int warrantyPeriod;
    private int warrantyCode;

    public GenuinePhone(String name, double price, String company, int warrantyPeriod, int warrantyCode) {
        super(name, price, company);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCode = warrantyCode;
    }

    public GenuinePhone() {
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyCode() {
        return warrantyCode;
    }

    public void setWarrantyCode(int warrantyCode) {
        this.warrantyCode = warrantyCode;
    }

    @Override
    public String toString() {
        return "Genuine{" + makeText() +
                ", warrantyPeriod= " + warrantyPeriod +
                ", warrantyCode= " + warrantyCode +
                "} ";
    }
}
