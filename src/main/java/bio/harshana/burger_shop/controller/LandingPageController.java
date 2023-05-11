package bio.harshana.burger_shop.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingPageController {

    public Button btnCustomer;
    public Button btnPlaceOrder;
    public Button BtnUpdateOrder;
    public Button btnViewOrder;
    public Button btnExit;

    public void ViewOrderOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/ViewOrder.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void UpdateOrderPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/UpdateOrder.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void PlaceOrderPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/PlaceOrderPage.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void CustomerPageOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setTitle("Home");
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/CustomerPage.fxml"))));
        stage.centerOnScreen();
        stage.show();
    }

    public void exitOnAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
