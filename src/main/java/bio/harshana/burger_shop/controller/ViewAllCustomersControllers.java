package bio.harshana.burger_shop.controller;

import bio.harshana.burger_shop.db.Database;
import bio.harshana.burger_shop.model.Customer;
import bio.harshana.burger_shop.tm.CustomerTM;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Arrays;

public class ViewAllCustomersControllers {
    public TableView tblCustomer;
    public TableColumn colCustId;
    public TableColumn colName;
    public TableColumn coltotal;

    public void initialize(){

        colCustId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        coltotal.setCellValueFactory(new PropertyValueFactory<>("total"));
        ObservableList<CustomerTM> customers = FXCollections.observableArrayList();
        System.out.println(Arrays.toString(Database.CustArray));
        Arrays.stream(Database.CustArray).forEach(customer -> {
            customers.add(new CustomerTM(
                    customer.getCustID(),
                    customer.getCustName(),
                    Database.getOrderTotalByCustID(customer.getCustID())
            ));
        });

        tblCustomer.setItems(customers);

    }


}
