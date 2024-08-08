/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class Escuela {

    private String nombreE;
    private String curso;
    private String profesor;
    private int calificacion;
    private int mayor;
    private int menor;
    private double promedio;

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    

    public Escuela(String nombreE, String curso, String profesor, int calificacion, double promedio) {
        this.nombreE = nombreE;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
        this.promedio = promedio;
    }

    public static void input(Escuela arrInfo[]) {
        int estudiante = 0;
        for (int i = 0; i < arrInfo.length; i++) {
            String nombreE = JOptionPane.showInputDialog(null, "Ingrese su nombre estudiante ");
            estudiante += 1;

            String curso = JOptionPane.showInputDialog(null, "Ingrese el codigo del curso ");
            String profesor = JOptionPane.showInputDialog(null, "Ingrese el nombre de su profe ");
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su calificacion "));

            double promedio = (estudiante / calificacion);

            arrInfo[i] = new Escuela(nombreE, curso, profesor, calificacion, promedio);

        }
    }

    public static void mostrar(Escuela arrInfo[]) {
        String mensaje = "";

        for (int i = 0; i < arrInfo.length; i++) {
            Escuela escuela = arrInfo[i];
            mensaje += "El estuadiante " + "" + escuela.getNombreE() + "" + "del curso " + "" + escuela.getCurso()
                    + "obtuvo la calificacion de" + escuela.getCalificacion() + ""+ escuela.getPromedio() ;
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
