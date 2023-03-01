package javafx.layout;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;

public class FXMLAnchorPaneReportsMonthlySalesController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis xAxis;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        series.setName("2016");
        series.getData().add(new XYChart.Data<>("January", 20));
        series.getData().add(new XYChart.Data<>("February", 40));
        series.getData().add(new XYChart.Data<>("March", 60));
        barChart.getData().add(series);
    }
    
}
