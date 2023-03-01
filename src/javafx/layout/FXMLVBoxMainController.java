package javafx.layout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;

public class FXMLVBoxMainController implements Initializable {

    @FXML
    private MenuItem menuItemRecordsClients;

    @FXML
    private MenuItem menuItemReportsMonthlySales;

    @FXML
    private AnchorPane anchorPane;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    @FXML
    public void showFXMLAnchorPaneRecordsClients() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLAnchorPaneRecordsClients.fxml"));
        anchorPane.getChildren().setAll(a);
    }
    
    public void showFXMLAnchorPaneReportsMonthlySales() throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("FXMLAnchorPaneReportsMonthlySales.fxml"));
        anchorPane.getChildren().setAll(a);
    }
}
