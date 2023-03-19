package javafx.tableview;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.model.Client;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLTableViewController implements Initializable {
    
    @FXML
    private TableView<Client> tableViewClients;

    @FXML
    private TableColumn<Client, String> tableColumnClientName;

    @FXML
    private TableColumn<Client, String> tableColumnClientPhone;

    @FXML
    private Button buttonRemove;

    private List<Client> listClients = new ArrayList<>();

    private ObservableList<Client> observableListClients;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadTableViewClients();

        if(!isEmpty()) tableViewClients.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> selectItemTableViewClients(newValue));
        else  System.out.println("List is Empty");
    }

    public void loadTableViewClients() {
        tableColumnClientName.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableColumnClientPhone.setCellValueFactory(new PropertyValueFactory<>("telefone"));

        includeClients();
        
        populateTableView();
    }

    public void includeClients() {
        Client c1 = new Client("Fernanda", "1111-2222");
        Client c2 = new Client("Mariana", "3333-4444");
        Client c3 = new Client("Gaby", "5555-6666");

        listClients.add(c1);
        listClients.add(c2);
        listClients.add(c3);
    }

    public void populateTableView() {
        observableListClients = FXCollections.observableArrayList(listClients);

        tableViewClients.setItems(observableListClients);
    }

    public void selectItemTableViewClients(Client client) {
        if(!isEmpty()) System.out.println("Client selected at Table View: " + client.getNome());
        else  System.out.println("List is Empty");     
    }

    public void removeItemTableViewClients() {
        if(!isEmpty()) {
            Client client = tableViewClients.getSelectionModel().getSelectedItem();

            System.out.println("Client removed from Table View: " + client.getNome());  

            listClients.remove(client);
            // tableViewClients.getItems().remove(client);
            observableListClients.remove(client);
        }
        else  System.out.println("List is Empty");
    }

    @FXML
    public boolean isEmpty() {
        if(listClients.isEmpty()) return true;
        return false;
    }
}
