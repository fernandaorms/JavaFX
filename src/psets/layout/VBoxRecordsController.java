package psets.layout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class VBoxRecordsController implements Initializable {

    @FXML
    private MenuItem menuItemClients;

    @FXML
    private AnchorPane anchorPane;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    public void switchToClients() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("AnchorPaneClients.fxml"));
        anchorPane.getChildren().setAll(a);
    }
    
}
