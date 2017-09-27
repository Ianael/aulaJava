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
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author ianael
 */
public class NewExamController extends UserInterface{

    @FXML
    private ComboBox boxDis;
    
    @FXML
    private ComboBox boxMed;
    
    public NewExamController(){
        super("newExam.fxml");
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        boxDis.getItems().addAll(
            "ADMINISTRAÇÃO DE NEGÓCIOS DE BASE TECNOLÓGICA",
            "ÁLGEBRA I",
            "ÁLGEBRA II",
            "ALGORITMOS E PROGRAMAÇÃO I",
            "ALGORITMOS E PROGRAMAÇÃO II",
            "ANÁLISE DE CIRCUITOS ELÉTRICOS",
            "ANÁLISE E CONTROLE DE PROCESSOS", 
            "ARQUITETURA DE COMPUTADORES I",
            "ARQUITETURA DE COMPUTADORES  II",
            "BANCO DE DADOS", 
            "CIRCUITOS DIGITAIS", 
            "COMUNICAÇÃO DIGITAL", 
            "CONTROLE LÓGICO DE SISTEMAS", 
            "CÁLCULO I",
            "CÁLCULO II",
            "CÁLCULO III",
            "CÁLCULO NUMERICO",
            "DESENHO TÉCNICO",
            "ELETRÔNICA APLICADA", 
            "ELETRÔNICA BÁSICA",
            "ENGENHARIA DE SOFTWARE I",
            "ENGENHARIA DE SOFTWARE II",
            "ENGENHARIA ECONÔMICA", 
            "ESTRUTURAS DE DADOS", 
            "ÉTICA EM INFORMÁTICA",
            "FÍSICA GERAL", 
            "FÍSICA III",
            "GERÊNCIA DE PROJETOS", 
            "GRAFOS",
            "INICIAÇÃO TÉCNICO-CIENTÍFICA", 
            "INTELIGÊNCIA ARTIFICIAL", 
            "INTERFACE HUMANO - COMPUTADOR", 
            "INTRODUÇÃO A ENGENHARIA DE COMPUTAÇÃO", 
            "INTRODUÇÃO AO CÁLCULO", 
            "INTRODUÇÃO À FÍSICA", 
            "LINGUAGENS FORMAIS",
            "MATEMÁTICA APLICADA À ENGENHARIA", 
            "MATEMÁTICA COMPUTACIONAL", 
            "MICROCONTROLADORES",
            "ÓTICA E FÍSICA PARA SEMICONDUTORES", 
            "PROBABILIDADE E ESTATÍSTICA",
            "PROCESSADOR DIGITAL DE SINAIS",
            "PROGRAMAÇÃO ORIENTADA A OBJETOS I",
            "PROGRAMAÇÃO ORIENTADA A OBJETOS II",
            "PROJETO DE SISTEMAS DIGITAIS",
            "PROJETO DE SISTEMAS EMBARCADOS", 
            "QUÍMICA I",
            "QUÍMICA II",
            "REDES DE COMPUTADORES I",
            "REDES DE COMPUTADORES II",
            "RESISTÊNCIA DOS MATERIAIS", 
            "SIMULAÇÃO DISCRETA", 
            "SISTEMAS DISTRIBUÍDOS",
            "SISTEMAS EM TEMPO REAL",
            "SISTEMAS OPERACIONAIS", 
            "SISTEMAS ROBÓTICOS", 
            "TCC I",
            "TCC II",
            "TCC III",
            "TÓP. ESPECIAIS EM INTEGRAÇÃO SOFTWARE HARDWARE",
            "TÓPICOS ESPECIAIS EM ENGENHARIA DE COMPUTAÇÃO", 
            "TÓPICOS ESPECIAIS EM HARDWARE"
        );
        
        boxMed.getItems().addAll("M1","M2","M3");
    }    
   
    public void goToMyExams(ActionEvent event ){
        ScreenController.getInstance().back(1);
    }
}
