/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author ianael
 */
public class MyExamsController extends UserInterface {

    @FXML
    private TableView table;
    
    @FXML
    private TableColumn<Exam, String> NameColumn;
    
    @FXML
    private TableColumn<Exam, String> SubjectColumn;
    
    @FXML
    private TableColumn<Exam, String> MColumn;
    
    @FXML
    private TableColumn<Exam, Double> ValueColumn;
    
    @FXML
    private TableColumn<Exam, Double> GradeColumn;

    private ObservableList data;
    public static int index;
    
    public MyExamsController(){
        super("myExams.fxml");
    }
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
        
        Exam ex = new Exam();
        ArrayList<Exam> list = ex.getExamList();
        
        ObservableList data2 = FXCollections.observableArrayList(list);
        
        this.data = data2;
        table.setItems(data);
        
        NameColumn.setCellValueFactory(new PropertyValueFactory("name"));
        SubjectColumn.setCellValueFactory(new PropertyValueFactory("subject"));
        MColumn.setCellValueFactory(new PropertyValueFactory("M"));
        ValueColumn.setCellValueFactory(new PropertyValueFactory("value"));
        GradeColumn.setCellValueFactory(new PropertyValueFactory("grade"));
       
    }    
    
    @FXML
    public void goToDashboard(ActionEvent event){
        ScreenController.getInstance().back();
    }
    
    @FXML
    public void goToNewExam(ActionEvent event){
        NewExamController nextScreen = new NewExamController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
    
    @FXML
    public void goToNewGrade(ActionEvent event){
        index = table.getSelectionModel().getSelectedIndex();
        NewGradeController nextScreen = new NewGradeController();
        ScreenController.getInstance().openScreen(nextScreen);
    }
}
