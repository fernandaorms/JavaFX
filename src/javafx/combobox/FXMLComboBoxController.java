package javafx.combobox;

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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FXMLComboBoxController implements Initializable {

    @FXML
    private TextField textFieldClientName;
    
    @FXML
    private TextField textFieldClientNumber;
    
    @FXML
    private Button buttonAdd;
    
    @FXML
    private ComboBox<Client> comboBoxClients;
    
    @FXML
    private Button buttonRemove;
    
    private List<Client> listClients = new ArrayList<>();
    
    private ObservableList<Client> observableListClients;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadClientsComboBox();
    }    
    
    @FXML
    public void loadClientsComboBox() {
        Client c1 = new Client("Fernanda", "1111-2222");
        Client c2 = new Client("Mariana", "3333-4444");
        
        listClients.add(c1);
        listClients.add(c2);
        
        populateComboBox();
    }
    
    @FXML
    public void addClient() {
        Client client = new Client(textFieldClientName.getText(), textFieldClientNumber.getText());
        
        listClients.add(client);
        
        populateComboBox();
        clearTextFields();
    }
    
    @FXML
    public void removeClient() {
        Client client = comboBoxClients.getSelectionModel().getSelectedItem();
       
        System.out.println("Client removed from ComboBox: " + client.getNome());
         listClients.remove(client);
        comboBoxClients.getItems().remove(client);
    }
    
    @FXML
    public void selectComboBoxClientItem() {
        /*
        Client client = comboBoxClients.getSelectionModel().getSelectedItem();
        System.out.println("Client select at ComboBox: " + client.getNome());
        */
    }
    
    @FXML
    public void convertListToObservableList(){
        observableListClients = FXCollections.observableArrayList(listClients);
    }
    
    @FXML
    public void populateComboBox() {
        convertListToObservableList();
        
        comboBoxClients.setItems(observableListClients);
    }
    
    @FXML
    public void clearTextFields() {
        textFieldClientName.setText("");
        textFieldClientNumber.setText("");
    }
}
