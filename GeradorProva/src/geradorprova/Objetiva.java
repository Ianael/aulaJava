/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;

/**
 *
 * @author ianae
 */
public class Objetiva extends Questao{
    private String[] opcoes = new String[5];
    private int respostaCorreta;

    /**
     * @return the respostaCorreta
     */
    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    /**
     * @param respostaCorreta the respostaCorreta to set
     */
    public void setRespostaCorreta(int respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    /**
     * @return the opcoes
     */
    public String[] getOpcoes() {
        return opcoes;
    }

    /**
     * @param opcoes the opcoes to set
     */
    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }
   
    @Override
    public String retornaQuestao(){
        String oProva = "";
        int i;
            
        oProva += "\nQuestão: " + this.getPergunta();
        oProva += "\nPeso: " + this.getPeso();
            
        for(i=0;i<5;i++){
            oProva += "\nOpção: " + this.getOpcoes()[i];
        }
        oProva += "\nResposta Correta: " + this.getRespostaCorreta();
            
       return oProva; 
   }
}
