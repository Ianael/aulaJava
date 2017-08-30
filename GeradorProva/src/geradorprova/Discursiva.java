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
public class Discursiva extends Questao{
    private String criterioCorrecao;

    /**
     * @return the criterioCorrecao
     */
    public String getCriterioCorrecao() {
        return criterioCorrecao;
    }

    /**
     * @param criterioCorrecao the criterioCorrecao to set
     */
    public void setCriterioCorrecao(String criterioCorrecao) {
        this.criterioCorrecao = criterioCorrecao;
    }
    
    @Override
    public String retornaQuestao() {
        String dProva = "";
        dProva += "\nQuestão: " + this.getPergunta();
        dProva += "\nCritério de Avaliação: " + this.getCriterioCorrecao();
        dProva += "\nPeso da Questão: " + this.getPeso();
           
        return dProva;
    }
}
