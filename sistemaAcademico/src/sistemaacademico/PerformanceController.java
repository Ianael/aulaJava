/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author ianael
 */
public class PerformanceController extends UserInterface{
    
    @FXML
    private ComboBox boxDis; 
    
    @FXML
    private BarChart<String, Number> chart;
    
    public PerformanceController(){
        super("myPerformance.fxml");
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Exam.getExamList().stream().filter((ex) -> (!this.boxDis.getItems().contains(ex.getSubject()))).forEachOrdered((ex) -> {
            this.boxDis.getItems().add(ex.getSubject());
        });
    }
    
    @FXML
    public void subjectsPerformance(){      
        CategoryAxis x = new CategoryAxis();      
        NumberAxis y = new NumberAxis();
        x.setLabel("Médias");
        y.setLabel("Nota");

        this.chart.getData().clear();
        
        XYChart.Series M1 = new XYChart.Series();
        M1.setName("M1");       
        M1.getData().add(new XYChart.Data(this.boxDis.getSelectionModel().getSelectedItem().toString(), Exam.finalM(this.boxDis.getSelectionModel().getSelectedItem().toString(), "M1")));
        
        XYChart.Series M2 = new XYChart.Series();
        M2.setName("M2");
        M2.getData().add(new XYChart.Data(this.boxDis.getSelectionModel().getSelectedItem().toString(), Exam.finalM(this.boxDis.getSelectionModel().getSelectedItem().toString(), "M2")));
        
        XYChart.Series M3 = new XYChart.Series();
        M3.setName("M3");
        M3.getData().add(new XYChart.Data(this.boxDis.getSelectionModel().getSelectedItem().toString(), Exam.finalM(this.boxDis.getSelectionModel().getSelectedItem().toString(), "M3")));
        
        XYChart.Series MF = new XYChart.Series();
        MF.setName("MF");
        MF.getData().add(new XYChart.Data(this.boxDis.getSelectionModel().getSelectedItem().toString(), Exam.finalM(this.boxDis.getSelectionModel().getSelectedItem().toString(), "MF")));
        
        this.chart.getData().addAll(M1, M2, M3, MF);
    }
    
    @FXML
    public void goToDashboard(ActionEvent event ){
        ScreenController.getInstance().back();
    }
}
