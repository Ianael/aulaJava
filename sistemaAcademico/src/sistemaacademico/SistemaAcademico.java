/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author ianael
 */
public class SistemaAcademico extends Application {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Sistema Acadêmico");
        DashboardController firstScreen = new DashboardController();
        ScreenController.getInstance().StageInitialize(primaryStage, firstScreen);
    }
}
