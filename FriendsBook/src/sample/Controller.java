package sample;

import javafx.collections.ObservableArrayBase;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.util.ArrayList;


public class Controller {

    public TextField textGetName;
    public TextField textGetQuantity;
    public TextField textGetCost;
    public ListView<Product> productList = new ListView<>();
    public Label lblName;
    public Label lblQuantity;
    public Label lblCost;
    public Button buttonPurchase;
    public Button btnLoad;
    public Button btnSave;

    public void addProduct(ActionEvent actionEvent) {
        String name = textGetName.getText();
        int quant = Integer.parseInt(textGetQuantity.getText());
        double cost = Double.parseDouble(textGetCost.getText());
        Product temp = new Product(name, quant, cost);
        productList.getItems().add(temp);
        textGetName.clear();
        textGetCost.clear();
        textGetQuantity.clear();
        buttonPurchase.setDisable(true);

    }
    public void saveProduct (ActionEvent actionEvent) throws IOException {
        ObservableList<Product> myList = productList.getItems();
        for(Product p : myList){
            p.writeToFile();
        }
        productList.getItems().clear();
    }
    public void loadProduct(ActionEvent actionEvent) throws IOException {
        productList.getItems().clear();
        ArrayList<Product> products = CreateProduct.createAllProducts("products.txt");
        for(Product p : products){
            productList.getItems().add(p);
        }
        System.out.println("Out product");
    }

    public void displayProperty(MouseEvent mouseEvent) {
        Product temp;
        temp = productList.getSelectionModel().getSelectedItem();
        lblCost.setText(Double.toString(temp.getCost()));
        lblName.setText(temp.name);
        lblQuantity.setText(Integer.toString(temp.getQuantity()));
        buttonPurchase.setDisable(false);
    }

    public void purchaseProduct(ActionEvent actionEvent) {
        Product temp;
        temp = productList.getSelectionModel().getSelectedItem();
        temp.purchase();
        lblQuantity.setText(Integer.toString(temp.getQuantity()));
        productList.getSelectionModel().getSelectedItems().remove(temp);

    }
}
