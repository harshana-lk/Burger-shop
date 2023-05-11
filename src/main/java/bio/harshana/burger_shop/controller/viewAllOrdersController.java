package bio.harshana.burger_shop.controller;

import bio.harshana.burger_shop.db.Database;
import bio.harshana.burger_shop.model.Order;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class viewAllOrdersController {
    public TableView tblOrders;
    public TableColumn colOId;
    public TableColumn colCustID;
    public TableColumn colqty;
    public TableColumn colOStatus;

    public void initialize(){
        loadAllOrders();
        setValueFactory();
    }
    public void loadAllOrders(){
        ObservableList<Order> orderList = FXCollections.observableArrayList(Database.orderArray);
        tblOrders.setItems(orderList);
    }

    private void setValueFactory(){
        colOId.setCellValueFactory(new PropertyValueFactory<>("orderID"));
        colCustID.setCellValueFactory(new PropertyValueFactory<>("custID"));
        colqty.setCellValueFactory(new PropertyValueFactory<>("Qty"));
        colOStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

    }
}
