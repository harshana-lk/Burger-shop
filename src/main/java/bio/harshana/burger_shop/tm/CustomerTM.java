package bio.harshana.burger_shop.tm;

public class CustomerTM {
    String id;
    String name;
    double total;
    public CustomerTM(String id, String name, double total) {
        this.id = id;
        this.name = name;
        this.total = total;
    }

    public CustomerTM() {
    }

    @Override
    public String toString() {
        return "CustomerTM{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", total=" + total + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
