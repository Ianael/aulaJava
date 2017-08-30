/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;

import java.util.ArrayList;

/**
 *
 * @author 6182275
 */
public class Prova {
    private String nomeDisciplina;
    private int peso;
    private String local;
    private String data;
    private ArrayList <Questao> listaQuestoes;
    
    /**
        Construtor da prova que inicializa o atributo peso como 10 e o nome da disciplina.
     * @param disciplina
    **/
    public Prova(String disciplina){
        this.peso = 10;
        this.nomeDisciplina = disciplina;
        this.listaQuestoes = new ArrayList();
    }
    
    /**
        Método que retorna a descrição da prova(informações principais).
     * @return 
    **/
    public String obtemDetalhes(){
        String provaString = "";
        
        provaString += "\n------------------------------------------------------\n";
        provaString += this.getNomeDisciplina()+"\n";
        provaString += "Nome: ______________________________";
        provaString += " Data: "+this.getData()+"\n";
        provaString += "Local: "+this.getLocal();
        provaString += "\tPeso: "+this.getPeso();
        provaString += "\n------------------------------------------------------\n";
        
        for(int i=0; i<this.listaQuestoes.size(); i++){
           provaString += this.listaQuestoes.get(i).retornaQuestao();
        }
        return provaString;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the listaQuestoes
     */
    public ArrayList <Questao> getListaQuestoes() {
        return listaQuestoes;
    }

    /**
     * @param listaQuestoes the listaQuestoes to set
     */
    public void setListaQuestoes(ArrayList <Questao> listaQuestoes) {
        this.listaQuestoes = listaQuestoes;
    }

}
