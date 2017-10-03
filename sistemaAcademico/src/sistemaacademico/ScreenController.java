/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.util.Stack;
import javafx.stage.Stage;

/**
 *
 * @author ianael
 */
public class ScreenController {
    private static ScreenController instance;
    
    private ScreenController(){
        this.stackReturn = new Stack<>();
    }
    
    public static ScreenController getInstance(){
        if(ScreenController.instance == null){
            ScreenController.instance = new ScreenController();
        }
        return ScreenController.instance;
    }
    
    private Stage stage;
    private final Stack <UserInterface> stackReturn;
    private UserInterface currentScreen;
    
    public void StageInitialize(Stage p, UserInterface firstInterface){
        this.stage = p;
        this.currentScreen = firstInterface;
        this.stage.setScene(firstInterface.getScene());
        this.stage.show();
    }
    
    private Stage getStage(){
        return this.stage;
    }
    
    public void openScreen(UserInterface newScreen) {
        this.stackReturn.push(this.currentScreen);
        this.getStage().setScene(newScreen.getScene());
        this.currentScreen = newScreen;
    }
    
    public void back() {
        if(!this.stackReturn.empty()){
            UserInterface previous = this.stackReturn.pop();
            this.getStage().setScene(previous.getScene());
            this.currentScreen = previous;
            previous.goBack();
            return;
        }
        System.err.println("A pilha de retorno esta vazia");
    }
    
    public void back(int qnt) {
        if(qnt <= this.stackReturn.size()){
            while(qnt > 1){
                this.stackReturn.pop();
                qnt--;
            }
            UserInterface previous = this.stackReturn.pop();
            this.getStage().setScene(previous.getScene());   
            this.currentScreen = previous;
            previous.goBack();
            return;
        }
        System.err.println("Número de retornos maior que o tamanho da pilha");       
    }
    
    
    public void openPopup(UserInterface newScreen){
        Stage popUp = new Stage();
        popUp.setScene(newScreen.getScene());
    }
}
