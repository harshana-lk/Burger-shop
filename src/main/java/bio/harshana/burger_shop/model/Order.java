package bio.harshana.burger_shop.model;

public class Order {
    String orderID;
    String custID;
    int Qty;
    int bill;
    String status;

    public Order(String orderID, String custID, int qty, int bill, String status) {
        this.orderID = orderID;
        this.custID = custID;
        Qty = qty;
        this.bill = bill;
        this.status = status;
    }

    public Order() {
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "order{" + "orderID='" + orderID + '\'' + ", custID='" + custID + '\'' + ", Qty=" + Qty + ", bill=" + bill + ", status='" + status + '\'' + '}';
    }


}
