/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ianael
 */
public class NewGradeController extends UserInterface{
    @FXML
    private Label LName;
    
    @FXML
    private Label LDis;   
    
    @FXML
    private Label LMed;
    
    @FXML
    private TextField textGrade;
    
    public NewGradeController(){
        super("newGrade.fxml");
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        int x = MyExamsController.index;
        Exam ex = new Exam();
        ArrayList<Exam> list = ex.getExamList();

        LDis.setText(list.get(x).getSubject());
        LName.setText(list.get(x).getName());
        LMed.setText(list.get(x).getM());
    }
    
    @FXML
    private void saveGrade(){  
        
        int x = MyExamsController.index;
        
        Exam ex = new Exam();
        ArrayList<Exam> list = ex.getExamList();
   
        list.get(x).setGrade(Double.parseDouble(textGrade.getText()));
        
        list.get(x).reload();
        
        ScreenController.getInstance().back(1);
    }
    
    @FXML
    public void goToMyExams(ActionEvent event ){
        ScreenController.getInstance().back(1);
    }
}
