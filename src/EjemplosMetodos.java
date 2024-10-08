import javax.swing.*;

public class EjemplosMetodos {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        JOptionPane.showMessageDialog(null,"La suma de "+ num1+"+"+ num2+"="+ suma(num1,num2));
        imprimirMensajes("Buenas nuevas");

    } // en la pila(o stack) van las variables y se ban borrando(o saliendo de la pila ) cuando terminan sus ejecuciones
    public static int suma(int num1, int num2){
        int total;
        total = num1 + num2;           //Funcion
        return total;
    }
    public static void imprimirMensajes(String msg){
        JOptionPane.showMessageDialog(null,"El mensaje del dia es "+ msg); //Metodo
    }
}
