package com.mycompany.examen_poo;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Circulo {
    
    Scanner dato1 = new Scanner(System.in);
    
    //Atributos
    private double radio;
    
    //Constructor
    public Circulo(double radio) {
        JOptionPane.showMessageDialog(null,"C I R C U L O");
        radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el radio del circulo: "));
        //System.out.print("Digite el radio del circulo: ");
        //radio = dato1.nextDouble();
        this.radio = radio;
    }

    
    //Metodo 
    public double mostrarDatos(){
        double areaCirc = (Math.PI*radio)*radio;
        JOptionPane.showMessageDialog(null,"El area del Circulo es: "+areaCirc+" cm");
      //System.out.print("El area del Circulo es: "+areaCirc+" cm");
        double periCirc = 2.0*Math.PI*radio;
        JOptionPane.showMessageDialog(null,"\nSu perimetro es de: "+periCirc+" cm");
      //System.out.print("\nSu perimetro es de: "+periCirc+" cm");
        return radio;
    }
    
    //Getters  
    public double getRadio() {
        return radio;
    }

    
}
