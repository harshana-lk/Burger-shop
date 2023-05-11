package bio.harshana.burger_shop.db;

import bio.harshana.burger_shop.model.Customer;
import bio.harshana.burger_shop.model.Order;

public class Database {
    public static Customer[] CustArray = new Customer[0];
    public static Order[] orderArray = new Order[0];

    public static Customer[] custIncrement(Customer customer) {
        try {
            Customer[] temp = new Customer[CustArray.length + 1];
            System.arraycopy(CustArray, 0, temp, 0, CustArray.length);
            CustArray = temp;
            CustArray[CustArray.length - 1] = customer;
            return CustArray;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Order[] orderIncrement(Order order) {
        try {
            Order[] temp = new Order[orderArray.length + 1];
            System.arraycopy(orderArray, 0, temp, 0, orderArray.length);
            orderArray = temp;
            orderArray[orderArray.length - 1] = order;
            return orderArray;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Order getOrder(String id) {

        for (Order o : orderArray) {
            if (o.getOrderID().equals(id)) {
                return o;
            }
            System.out.println("Looping");
        }
        return null;
    }

    public static String setCustName(String id) {
        for (Customer c1 : CustArray) {
            if (c1.getCustID().equals(id)) {
                return c1.getCustName();
            }
        }
        return null;
    }

    public static boolean updateCustomer(Customer customer) {
        int index = getCustIndex(customer.getCustID());
        try {
            CustArray[index] = customer;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int getCustIndex(String id) {
        for (int i = 0; i < CustArray.length; i++) {
            if (CustArray[i].getCustID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static int getOrderIndex(String id) {
        System.out.println(id);
        for (int i = 0; i < orderArray.length; i++) {
            if (orderArray[i].getOrderID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static String getTotal(String id) {
        for (Order o1 : orderArray) {
            if (o1.getCustID().equals(id)) {
                return String.valueOf(o1.getBill());
            }
        }
        return null;
    }

    public static double getOrderTotalByCustID(String custID) {
        for (Customer c1 : CustArray) {
            if (c1.getCustID().equals(custID)) {
                return Double.parseDouble(Database.getTotal(custID));
            }
        }
        return 0.00;
    }
}
