package com.mycompany.examen_poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal_Examen {
    public static void main(String[] args) {        
        
        //Objeto de Circulo
        Circulo cr = new Circulo(0);
        JOptionPane.showMessageDialog(null,"Radio de: "+cr.getRadio()+" cm");
        //System.out.println("Radio de: "+cr.getRadio()+" cm");
        cr.mostrarDatos();
        
        System.out.println("\n");
        
        //Objeto de Rectangulo
        Rectangulo rec = new Rectangulo(0, 0);
        rec.areaRectangulo();
        rec.periRectangulo();
        
        System.out.println("\n");
        
        //Objeto de Cuadrado
        Cuadrado cd = new Cuadrado(0);
        JOptionPane.showMessageDialog(null,"Lado de: "+cd.getLado()+" cm");
       // System.out.println("Lado de: "+cd.getLado()+" cm");
        cd.areaCuadrado();
        cd.periCuad();
        
        System.out.println("\n");
        
        //Objeto Triangulo
        Triangulo tr = new Triangulo();
        tr.calcularTriangulos();
        
                
    }
}
