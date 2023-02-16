package javafx.textfield;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class FXMLTextFieldController implements Initializable {

    @FXML
    private Label labelUser;
    
    @FXML
    private Label labelPassword;
    
    @FXML
    private TextField textFieldUser;
    
    @FXML
    private PasswordField passwordFieldPassword;
    
    @FXML
    private Button buttonLogin;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
       public void login() {
           Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
           
            alert.setTitle("Log In - Title");
            alert.setHeaderText("Log In - Heading");
            alert.setContentText("The user " + textFieldUser.getText() + " successfully Logged In.\nPassword is: " + passwordFieldPassword.getText());       
                 
            alert.show();
       }
}
