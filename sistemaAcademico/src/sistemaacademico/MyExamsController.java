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
public class MyExamsController extends UserInterface {

    public MyExamsController(){
        super("myExams.fxml");
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
    public void goToDashboard(ActionEvent event ){
        ScreenController.getInstance().back();
    }
    
    @FXML
    public void goToNewExam(ActionEvent event){
        NewExamController nextScreen = new NewExamController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
    
    @FXML
    public void goToNewGrade(ActionEvent event){
        NewGradeController nextScreen = new NewGradeController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
}
