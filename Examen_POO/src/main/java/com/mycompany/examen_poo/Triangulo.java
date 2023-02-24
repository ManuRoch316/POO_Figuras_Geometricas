package com.mycompany.examen_poo;
import javax.swing.JOptionPane;

public class Triangulo {
    float lado1;
    float lado2;
    float lado3;
    double hipo;
    double area;
    double perimetro;
    
    public void calcularTriangulos(){
        JOptionPane.showMessageDialog(null,"T R I A N G U L O");
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Lado 1"));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Lado 2"));
        lado3=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el Lado 3/(Base)"));
       
        if(lado1==lado2 && lado2==lado3 ){
            JOptionPane.showMessageDialog(null,"Triangulo Equilatero: ");
            hipo=Math.sqrt(lado1*lado1) + ((lado3/2)*(lado3/2));
            JOptionPane.showMessageDialog(null,"La Hipotenuza es: "+ hipo);
            area= lado3*hipo/2;
            JOptionPane.showMessageDialog(null,"El Area: "+ area);
            perimetro = lado1*3;
            JOptionPane.showMessageDialog(null,"El Perimetro es: "+ perimetro);
            
            
        }
        else if(lado1!=lado2 && lado2!=lado3){
                JOptionPane.showMessageDialog(null,"TRIANGULO ESCALENO");
                 hipo=Math.sqrt(lado1*lado1) + ((lado3/2)*(lado3/2));
                JOptionPane.showMessageDialog(null,"La Hipotenuza es: "+ hipo);
                area= lado3*hipo/2;
                JOptionPane.showMessageDialog(null,"El Area es: "+ area);
                perimetro=lado1+lado2+lado3;
                JOptionPane.showMessageDialog(null,"El Perimetro es: "+ perimetro);
            }
          else{
                JOptionPane.showMessageDialog(null,"TRIANGULO ISOSCELES");
                hipo=Math.sqrt(lado1*lado1) + ((lado3/2)*(lado3/2));
                JOptionPane.showMessageDialog(null,"La Hipotenuza es: "+ hipo);
                area= lado3*hipo/2;
                JOptionPane.showMessageDialog(null,"El Area es: "+ area);
                perimetro=lado1+lado2+lado3;
                JOptionPane.showMessageDialog(null,"El perimetro es: "+ perimetro);
                
              
          }
    }
  }