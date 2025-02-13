public class Gc {
    public static void main(String[] args) {
        Phone phone=new Phone("apple","16 pro max");
        System.out.println(phone);

    }

}
class Phone{
    String brandname;
    String model;

    public Phone(String brandname, String model) {
        this.brandname = brandname;
        this.model = model;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brandname='" + brandname + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}