/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Aulas Heredia
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 10;
        Escuela[] arrInfo = new Escuela[x];

        Escuela.input(arrInfo);
        Escuela.mostrar(arrInfo);
    }
    
}
