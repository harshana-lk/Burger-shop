package bio.harshana.burger_shop.controller;

import bio.harshana.burger_shop.db.Database;
import bio.harshana.burger_shop.model.Customer;
import bio.harshana.burger_shop.model.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.util.Arrays;

public class UpdateOrderController {
    private static Order order = null;
    public ComboBox cbxOrderID;
    public TextField txtCustID;
    public TextField txtCustName;
    public TextField txtQty;
    public TextField txtBill;
    public ComboBox cbxOrderStatus;
    public Button btnPlaceOrder;
    public Button btnCancel;
    public Button btnBack;

    public void initialize() {
        cbxOrderStatus.getItems().addAll("Preparing", "Completed", "Cancel");
        setOrderIDs();

    }


    private void setOrderIDs() {
//        System.out.println();
        ObservableList<String> oIDs = FXCollections.observableArrayList();
        Arrays.stream(Database.orderArray).forEach(Order -> oIDs.add(Order.getOrderID()));
        cbxOrderID.setItems(oIDs);
    }

    public void setDataOnAction(ActionEvent actionEvent) {
        try {
            order = Database.getOrder(cbxOrderID.getValue().toString());
            String name = Database.setCustName(order.getCustID());
            txtCustID.setText(order.getCustID());
            txtCustName.setText(name);
            txtQty.setText(String.valueOf(order.getQty()));
            txtBill.setText(String.valueOf(order.getBill()));
            cbxOrderStatus.setValue(order.getStatus());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void placeOrderOnAction(ActionEvent actionEvent) {
        order.setQty(Integer.parseInt(txtQty.getText()));
        order.setStatus(cbxOrderStatus.getValue().toString());

        int i = Database.getOrderIndex(order.getOrderID());
        System.out.println(i);
        try {
            Database.orderArray[i] = order;
            new Alert(Alert.AlertType.CONFIRMATION, "Updated Successfully").show();
        } catch (Exception e) {
            new Alert(Alert.AlertType.ERROR, "Try Again").show();
            e.printStackTrace();
        }
    }

    public void CancelOnAction(ActionEvent actionEvent) {
    }

    public void backOnAction(ActionEvent actionEvent) {
    }

    public void fillData(KeyEvent actionEvent) {
        int value = 500 * (Integer.parseInt(txtQty.getText()));
        txtBill.setText(String.valueOf(value));
    }
}
