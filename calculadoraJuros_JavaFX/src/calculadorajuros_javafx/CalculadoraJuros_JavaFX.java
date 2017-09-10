/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajuros_javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ianael
 */
public class CalculadoraJuros_JavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage){
        
        VBox orquestrador = new VBox();
        orquestrador.setSpacing(2);
        orquestrador.setStyle("-fx-background-color: #B0C4DE;");
        
        Label valorP = new Label("Valor Presente:");
        TextField vp = new TextField();
        Label periodo = new Label("Periodo:");
        TextField n = new TextField();
        Label tax = new Label("Taxa:");
        TextField taxa = new TextField();
        
        Button btn1 = new Button();
        btn1.setText("Juros Simples");
        
        Button btn2 = new Button();
        btn2.setText("Juros Composto");
        
        Label juros = new Label("Juros:");
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String VP = vp.getText();
                String N = n.getText();
                String Taxa = taxa.getText();
                
                double vpD = Double.parseDouble(VP);
                double nD = Double.parseDouble(N);
                double taxaD = Double.parseDouble(Taxa);
                
                double resultado = vpD*taxaD*nD;
                juros.setText( "Juros: "+resultado);
            }
        });
        
        btn2.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent event) {
                String VP = vp.getText();
                String N = n.getText();
                String Taxa = taxa.getText();
                
                double vpD = Double.parseDouble(VP);
                double nD = Double.parseDouble(N);
                double taxaD = Double.parseDouble(Taxa);
                
                double resultado = vpD*(Math.pow((1+taxaD),nD)-1);
                juros.setText( "Juros: "+resultado);
            }
        });
        
        orquestrador.getChildren().add(valorP);
        orquestrador.getChildren().add(vp);
        orquestrador.getChildren().add(periodo);
        orquestrador.getChildren().add(n);
        orquestrador.getChildren().add(tax);
        orquestrador.getChildren().add(taxa);
        orquestrador.getChildren().add(btn1);
        orquestrador.getChildren().add(btn2);
        orquestrador.getChildren().add(juros);
        
        Scene cena = new Scene(orquestrador, 300, 350);
        
        primaryStage.setTitle("Calcula Juros");
        primaryStage.setScene(cena);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
