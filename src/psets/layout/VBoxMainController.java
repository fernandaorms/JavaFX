package psets.layout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class VBoxMainController implements Initializable {

    @FXML
    private Button btnLogin;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    public void switchToRecords() throws IOException {
       Main.setRoot("VBoxRecords");
    }
    
}
