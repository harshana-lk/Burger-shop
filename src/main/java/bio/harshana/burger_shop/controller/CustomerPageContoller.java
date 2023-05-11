package bio.harshana.burger_shop.controller;

import bio.harshana.burger_shop.db.Database;
import bio.harshana.burger_shop.model.Customer;
import bio.harshana.burger_shop.model.Order;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class CustomerPageContoller {
    public TextField txtCustID;
    public TextField txtCustName;
    public Label lblOrderID;
    public TextField txtQty;
    public TextField txtBill;
    public Button btnPlaceOrder;
    public Button btnCancel;
    public Button btnBack;

    public void initialize(){
        setCustID();
    }

    public void placeOrderOnAction(ActionEvent actionEvent) {
        Customer c1 = new Customer(
                txtCustID.getText(),
                txtCustName.getText());

        Order order1 = new Order(
                lblOrderID.getText(),
                txtCustID.getText(),
                Integer.parseInt(txtQty.getText()),
                Integer.parseInt(txtBill.getText()),
                "Preparing");

        boolean isSaved = Database.custIncrement(c1)!=null;
        boolean isSave = Database.orderIncrement(order1)!=null;

        if (isSaved && isSave) {
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Saved").show();
            txtCustID.clear();
            txtCustName.clear();
            txtQty.clear();
            txtBill.clear();
            setCustID();
        } else {
            new Alert(Alert.AlertType.CONFIRMATION, "Try Again").show();
        }
    }

    public void CancelOnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) {
    }
    private void setCustID() {
        System.out.println(Database.orderArray.length);
        if (Database.orderArray.length<1) {
            lblOrderID.setText("B-0001");
            return;
        }
        String tempOrderID = Database.orderArray[Database.orderArray.length - 1].getOrderID();
        String array[] = tempOrderID.split("-");
        int tempNum = Integer.parseInt(array[1]);
        int finalOrderID = tempNum + 1;
        lblOrderID.setText("B-000" + finalOrderID);
    }


    public void fillData(KeyEvent keyEvent) {
        int value = 500*(Integer.parseInt(txtQty.getText()));
        txtBill.setText(String.valueOf(value));
    }
}
