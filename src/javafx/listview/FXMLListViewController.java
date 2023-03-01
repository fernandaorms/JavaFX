package javafx.listview;

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
import javafx.scene.control.ListView;

public class FXMLListViewController implements Initializable {
    
    @FXML
    private ListView<Client> listViewClients;
    
    @FXML
    private Button buttonRemove;
    
    private List<Client> listClients = new ArrayList<>();
    
    private ObservableList<Client> observableListClients;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadClientsListView();

        /* */
        if(!isEmpty()) listViewClients.getSelectionModel().selectedItemProperty().addListener(
            (observable, oldValue, newValue) -> selectListViewClientItem(newValue));
    }    
    
    @FXML
    public void loadClientsListView() {
        Client c1 = new Client("Fernanda", "1111-2222");
        Client c2 = new Client("Mariana", "3333-4444");
        Client c3 = new Client("Gaby", "5555-6666");
        
        listClients.add(c1);
        listClients.add(c2);
        listClients.add(c3);
        
        populateListView();
    }
    
    @FXML
    public void convertListToObservableList(){
        observableListClients = FXCollections.observableArrayList(listClients);
    }
    
    @FXML
    public void populateListView() {
        convertListToObservableList();
        
        listViewClients.setItems(observableListClients);
    }
    
    @FXML 
    public void selectListViewClientItemMouseClick() {
        if(!isEmpty()) {
            Client client = listViewClients.getSelectionModel().getSelectedItem();
            System.out.println("Client select by mouse click: " + client.getNome());
        }
        else  System.out.println("List is Empty");
    }
    
    @FXML
    public void removeClient() {
        if(!isEmpty()) {
            Client client = listViewClients.getSelectionModel().getSelectedItem();
       
            listClients.remove(client);
            listViewClients.getItems().remove(client);
            // observableListClients.remove(client);
            
            System.out.println("Client removed from ListView: " + client.getNome());
        }
        else  System.out.println("List is Empty");
    }

    @FXML 
    public void selectListViewClientItem(Client client) {
        if(!isEmpty()) {
            System.out.println("Client select: " + client.getNome());
        }
        else  System.out.println("List is Empty");
        
    }

    @FXML
    public boolean isEmpty() {
        if(listClients.isEmpty()) return true;
        return false;
    }
}
