package EjercicioIf;

import javax.swing.JOptionPane;


public class EjercicioIf {
     public static void main(String[]args){
     
         int n;
         
         n=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
     
         
         if(n%2==0)
             JOptionPane.showMessageDialog(null,"El numero es par");
         else
             JOptionPane.showMessageDialog(null,"El numero es impar");
         
     }
}
