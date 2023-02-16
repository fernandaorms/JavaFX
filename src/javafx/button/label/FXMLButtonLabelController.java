package javafx.button.label;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class FXMLButtonLabelController implements Initializable {
    
    @FXML
    private Button button;
    
    @FXML
    private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void clickButtonChangeLabel() {
        if(label.getText().equals("You clicked the button!")) label.setText("Ops, try again!");
        else label.setText("You clicked the button!");
    }
}
