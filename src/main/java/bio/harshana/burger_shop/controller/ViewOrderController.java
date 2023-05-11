package bio.harshana.burger_shop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewOrderController {
    public Button btnAllOrders;
    public Button btnAllCustomers;
    public Button btnViewOrder;

    public void allOrdersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/viewAllOrders.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void allCustomersOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ViewAllCustomers.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void viewOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ViewOneOrder.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }
}
