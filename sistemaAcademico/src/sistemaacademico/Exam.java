/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ianael
 */
public class Exam{
    private String name;
    private String subject;
    private double value;
    private double grade;
    private String M;
    private int archiveLine;

    public Exam(){
    
    }
    
    public void save(){
        try{
            File arch = new File("Exams.CSV");
            FileWriter out;

            if(arch.exists()){
               out = new FileWriter(arch, true);
            }else{
               out = new FileWriter(arch);
            }
            out.write(subject+";"+M+";"+name+";"+value+"\n");
            out.close();
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void reload(){
        File arch = new File("Exams.CSV");
        
        try{
            List<String> lines = Files.readAllLines(arch.toPath());

            lines.remove(MyExamsController.index);
            lines.add(MyExamsController.index, this.subject + ";" + this.M + ";" + this.name + ";" + this.value + ";" + this.grade);

            Files.write(arch.toPath(), lines, StandardCharsets.UTF_8);
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    
    public static ArrayList<Exam> getExamList(){     
        String table;
        BufferedReader br = null;
        FileReader fr = null;
        
        ArrayList<String> exa = new ArrayList<>();
        ArrayList<Exam> exam = new ArrayList<>();
        
        try {
            fr = new FileReader("Exams.CSV");
            br = new BufferedReader(fr);
            while((table = br.readLine()) != null){
                exa.add(table);
            }
            
            Exam ex;
            for(int i = 0; i < exa.size(); i++){
                
                String[] part = exa.get(i).split(";");
                
                ex = new Exam();
                ex.setSubject(part[0]);
                ex.setM(part[1]);
                ex.setName(part[2]);
                ex.setValue(Double.parseDouble(part[3]));
                if(part.length>=5){
                    ex.setGrade(Double.parseDouble(part[4]));
                }else{
                    ex.setGrade(0.0);
                }
                exam.add(ex);
            }

        }catch(IOException e){
        }finally{
            try{
                if(br != null){
                    br.close();
                }

                if(fr != null){
                    fr.close();
                }

            }catch(IOException e2){}
        }
    
        return exam;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * @return the archiveLine
     */
    public int getArchiveLine() {
        return archiveLine;
    }

    /**
     * @param archiveLine the archiveLine to set
     */
    public void setArchiveLine(int archiveLine) {
        this.archiveLine = archiveLine;
    }

    /**
     * @return the M
     */
    public String getM() {
        return M;
    }

    /**
     * @param M the M to set
     */
    public void setM(String M) {
        this.M = M;
    }
    
    /**
     *
     * @param subject
     * @param M
     * @return
     */
    public static double finalM(String subject, String M){     
        double MFinal = 0;
        double Value = 0;
        
        if(!M.equals("MF")){
            for(Exam ex : getExamList()){
                if(ex.subject.equals(subject) && ex.M.equals(M)){
                    MFinal += ex.grade * ex.value;
                    Value += ex.value;
                }
            }

            MFinal /= Value;   
        }else{
            MFinal = (finalM(subject, "M1") + finalM(subject, "M2") + finalM(subject, "M3"))/3;
        }
        
        if(Double.isNaN(MFinal)){
            MFinal = 0;
        }

        return MFinal;
    }
    
}
