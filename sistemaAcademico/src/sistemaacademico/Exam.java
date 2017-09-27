/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author ianael
 */
public class Exam{
    private String name;
    private String subject;
    private double value;
    private double grade;
    private char M;
    private int archiveLine;

    public Exam(){
    
    }
    
    /*public void save(){
        String csvExams = p.obtemDetalhes()
        try{
            File arch = new File("Exams.csv");
            FileWriter out = new FileWriter(arch);
            out.write(csvExams);
            out.close();
        }finally{}
    }*/
    
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
     * @return the M
     */
    public char getM() {
        return M;
    }

    /**
     * @param M the M to set
     */
    public void setM(char M) {
        this.M = M;
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
    
    
}
