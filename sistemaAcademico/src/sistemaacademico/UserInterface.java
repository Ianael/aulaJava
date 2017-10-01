/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 *
 * @author ianael
 */
public abstract class UserInterface implements Initializable{
    
    private Scene newScene;
    private String FxmlPath;
    
    protected UserInterface(String FxmlPath){
        this.FxmlPath = FxmlPath;
    }
    
    public void goBack(){
        URL u = null;
        ResourceBundle r = null;
        initialize(u,r);
    }
    
    public final Scene getScene(){
        if(this.newScene != null){
            return this.newScene;
        }
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource(FxmlPath));
            loader.setController(this);            
            Pane principalElement = loader.load();            
            this.newScene = new Scene(principalElement, 1024, 768);
        }catch(IOException ex){
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.newScene;
    }
    
}

