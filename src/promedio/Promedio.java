
package promedio;

import javax.swing.JOptionPane;


public class Promedio {

    public static void main(String[] args) {
        //declaracion de las variables
        int nota1,nota2;
        double promedio;
        //Entrada de datos
        nota1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota1"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota2"));
        //Proceso
        promedio=(nota1+nota2)/2;
        //Salida
        JOptionPane.showMessageDialog(null, "El promedio es: " + promedio);
    }
    
}
