/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorprova;
/**
 *
 * @author 6182275
 */
import java.util.Scanner;

public class GeradorProva {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome, local, data;
        int peso, qnt, i;
        
        int[] x = new int[5]; 
        
        System.out.println("Nome da Disciplina: ");
        nome = s.nextLine();
        Prova p = new Prova(nome);

        System.out.println("Local da Prova: ");
        local = s.nextLine();
        p.setLocal(local);
        System.out.println("Data: ");
        data = s.nextLine();
        p.setData(data);
        System.out.println("Peso da Prova: ");
        peso = s.nextInt();
        p.setPeso(peso);

        while(true){
            System.out.println("Qual o tipo de questão?(X/O/D) ");
            String decisao = s.nextLine();
            if("X".equalsIgnoreCase(decisao)){
                break;
            }else if("O".equalsIgnoreCase(decisao)){
                Objetiva o = new Objetiva();
                String alternativa[] = new String[5];
               
                System.out.println("Pergunta: ");
                o.setPergunta(s.nextLine());
                System.out.println("Peso: ");
                o.setPeso(s.nextInt());
                s.nextLine();
               
                for(i=0;i<5;i++){
                    System.out.println("Alternativa "+(i+1)+": ");
                    alternativa[i] = s.nextLine();
                }
                o.setOpcoes(alternativa);
                System.out.println("Resposta Correta: ");
                o.setRespostaCorreta(s.nextInt());
                s.nextLine();
                p.getListaQuestoes().add(o);
               
            }else if("D".equalsIgnoreCase(decisao)){
                Discursiva d = new Discursiva();
               
                System.out.println("Pergunta: ");
                d.setPergunta(s.nextLine());
                System.out.println("Peso: ");
                d.setPeso(s.nextInt());
                s.nextLine();
                System.out.println("Critério de Correção: ");
                d.setCriterioCorrecao(s.nextLine());
                p.getListaQuestoes().add(d);
               
            }else{
                System.out.println("Opção Inválida!!!");
            }
        }
        System.out.println(p.obtemDetalhes());
    }
}
