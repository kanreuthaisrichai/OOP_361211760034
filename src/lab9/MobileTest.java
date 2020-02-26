package lab9;

public class MobileTest extends Employee {
    private int MobileID;
    private String Brand;
    private String Generation;
    private double Price;
    private String OperatingST;
    //constructor

    public MobileTest(int mobileID, String brand, String generation, double price, String operatingST) {
        MobileID = mobileID;
        Brand = brand;
        Generation = generation;
        Price = price;
        OperatingST = operatingST;
    }

//getter and setter

    public int getMobileID() {
        return MobileID;
    }

    public void setMobileID(int mobileID) {
        MobileID = mobileID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getGeneration() {
        return Generation;
    }

    public void setGeneration(String generation) {
        Generation = generation;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getOperatingST() {
        return OperatingST;
    }

    public void setOperatingST(String operatingST) {
        OperatingST = operatingST;
    }

//toString

    @Override
    public String toString() {
        return "MobileTest{" +
                "MobileID=" + MobileID +
                ", Brand='" + Brand + '\'' +
                ", Generation='" + Generation + '\'' +
                ", Price=" + Price +
                ", OperatingST='" + OperatingST + '\'' +
                '}';
    }
}
