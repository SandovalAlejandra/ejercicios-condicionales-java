
package EjercicioSwitch;

import javax.swing.JOptionPane;


public class EjercicioSwitch {
     public static void main(String[]args){
     
     int operacion;
     double a,b,resultado=0;
     
     a=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
     b=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
     operacion = Integer.parseInt(JOptionPane.showInputDialog("Elije una operacion:\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division"));
     
     switch(operacion){
     
         case 1: 
             resultado=a+b;
             break;
         case 2:
             if(a>b)
                 resultado=a-b;
             else
                 resultado=b-a;
              break;
         case 3:
             resultado=a*b;
             break;
         case 4:
             if(a>b)
                 resultado=a/b;
             else
                 resultado=b/a;
              break;
             
         default: JOptionPane.showMessageDialog(null, "Esa operacion no existe");
             
          }
     
          JOptionPane.showMessageDialog(null, "El resultado es:"+resultado);
     }
}
