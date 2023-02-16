package javafx.button.alert;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class FXMLButtonAlertController implements Initializable {
    
    @FXML
    private Button button;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void clickButtonShowAlert() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        
        alert.setTitle("This is the Alert's title");
        alert.setHeaderText("This is Article's heading");
        alert.setContentText("This is Alert's content!");
        
        alert.show();
    }
}
