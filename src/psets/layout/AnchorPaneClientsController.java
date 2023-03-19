package psets.layout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AnchorPaneClientsController implements Initializable {

    @FXML
    private Button btnInsert;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
    }

    public void switchToInsertClient() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("VBoxInsertClient.fxml"));
        
        Stage stageTelaB = new Stage();
        stageTelaB.setTitle("Tela B");

        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stageTelaB.setScene(scene);
        stageTelaB.show();
    }
    
}
