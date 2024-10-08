import javax.swing.*;

public class EjemploInterfaz {
    public static void main(String[] args) {
        String nombre;
        int num1 , num2, sum;
       // nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        //System.out.println(nombre);
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        //wrappers = envoltorios en donde se engbloba ej = int es primitivo y Integer es wrapper
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
        sum = num1 + num2;
        //System.out.println("La suma es "+ sum);
        JOptionPane.showMessageDialog(null,"La suma es "+sum);
    }
}
