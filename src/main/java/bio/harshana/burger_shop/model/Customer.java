package bio.harshana.burger_shop.model;

public class Customer {
    String custID;
    String custName;

    public Customer(String custID, String custName) {
        this.custID = custID;
        this.custName = custName;
    }

    public Customer() {
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    @Override
    public String toString() {
        return "customer{" + "custID='" + custID + '\'' + ", custName='" + custName + '\'' + '}';
    }

}
