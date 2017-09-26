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

/**
 * FXML Controller class
 *
 * @author ianael
 */
public class DashboardController extends UserInterface {

    public DashboardController(){
        super("dashboard.fxml");
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void goToMyExams(ActionEvent event){
        MyExamsController nextScreen = new MyExamsController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
    
    @FXML
    public void goToPerformance(ActionEvent event){
        PerformanceController nextScreen = new PerformanceController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
}
