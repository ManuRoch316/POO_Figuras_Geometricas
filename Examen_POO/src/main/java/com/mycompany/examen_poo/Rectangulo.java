package com.mycompany.examen_poo;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Rectangulo {
    
    //Scanner dato2 = new Scanner(System.in);
    
    //Atributos
    private double base;
    private double altura;
    
    //Constructor
    public Rectangulo(double base, double altura){   
        JOptionPane.showMessageDialog(null,"R E C T A N G U L O");
        
        do{
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite la Base del Rectangulo: "));
       // System.out.println("Digite la Base del Rectangulo: ");
        //base = dato2.nextDouble();
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite la Altura del Rectangulo: "));
        //System.out.println("Digite la Altura del Rectangulo: ");
        //altura = dato2.nextDouble();
        
        
            if(base != altura){
                JOptionPane.showMessageDialog(null,"Base de: "+base+" cm"+"\nAltura de: "+ altura+" cm");
            //System.out.println("Base de: "+base+" cm"+"\nAltura de: "+ altura+" cm");
            }else{
                JOptionPane.showMessageDialog(null,"No se puede, seria un cuadrado. Vuelva a Intentarlo");
                //System.out.println("No se puede, seria un cuadrado. Vuelva a Intentarlo");
            }       
        }while(base == altura);
        
        this.base = base;
        this.altura = altura;
        
    }

    //Metodos
    public void areaRectangulo() {
        double area = base*altura;
        JOptionPane.showMessageDialog(null,"El area del Rectangulo es: "+area+" cm");
      //System.out.println("El area del Rectangulo es: "+area+" cm");
    }
    
    public void periRectangulo(){
        double perimetro = (base*base)+(altura*altura);
        JOptionPane.showMessageDialog(null,"El Perimetro del rectangulo es: "+perimetro+" cm");
      //System.out.println("El Perimetro del rectangulo es: "+perimetro+" cm");
    }
    
    //Getters

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
}
