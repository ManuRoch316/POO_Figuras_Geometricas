package com.mycompany.examen_poo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Cuadrado {
    
    //Scanner dato3 = new Scanner(System.in);
    
    //Atributos
    private double lado;
    
    //Constructor
    public Cuadrado(double lado){ 
        JOptionPane.showMessageDialog(null,"C U A D R A D O");
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el Lado del Cuadrado: "));
      //System.out.print("Digite el Lado del Cuadrado: ");
      //lado = dato3.nextDouble();
        this.lado = lado;
    }

    //Metodos
    public double areaCuadrado(){
        double areaCuad = lado*lado;
        JOptionPane.showMessageDialog(null,"El area del Cuadrado es: "+areaCuad+" cm");
      //System.out.println("El area del Cuadrado es: "+areaCuad+" cm");
        return lado;
    }
    
    public double periCuad(){
        double periCuad = (lado)*4;
        JOptionPane.showMessageDialog(null,"El perimetro del Cuadrado es: "+periCuad+" cm");
      //System.out.println("El perimetro del Cuadrado es: "+periCuad+" cm");
        return lado;
    }
    
    //Getters

    public double getLado() {
        return lado;
    }
    
}
