package bio.harshana.burger_shop.controller;

import bio.harshana.burger_shop.db.Database;
import bio.harshana.burger_shop.model.Order;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ViewOneOrderController {
    private static Order order = null;
    public TextField txtOrderId;
    public Label ibiCustId;
    public Label ibiCustName;
    public Label lblBurQty;
    public Label ibiBillValue;
    public Label ibiOrderStatus;

    public void loadDataOnAction(ActionEvent actionEvent) {
        String orderId = txtOrderId.getText();
        System.out.println(orderId);


        try{
            System.out.println(orderId);
            order = Database.getOrder(orderId);
            System.out.println(order.toString());
            String name = Database.setCustName(order.getCustID());
//            System.out.println(orderValues.toString());
            ibiCustId.setText(String.valueOf(order.getCustID()));
            ibiCustName.setText(name);
            lblBurQty.setText(String.valueOf(order.getQty()));
            ibiBillValue.setText(String.valueOf(order.getBill()));
            ibiOrderStatus.setText(order.getStatus());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
