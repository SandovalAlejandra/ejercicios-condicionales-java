
package EjercicioIfElse;

import javax.swing.JOptionPane;


public class EjercicioIfElse {
     public static void main(String[]args){
     
          int edad,precio=25;
          double dsct,precioFinal;
          
          edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
          
          if(edad<13||edad>59){
              dsct=0.5;
              precioFinal=precio-precio*dsct;
          }
          else if(edad>=13&&edad<=18){
              dsct=0.2;
              precioFinal=precio-precio+dsct;
          }
          else
              precioFinal=precio;
              
         
          JOptionPane.showMessageDialog(null,"El precio a pagar es: "+precioFinal);
     }
}
