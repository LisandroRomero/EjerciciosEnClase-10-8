import javax.swing.*;

public class While {
    public static void main(String[] args) {
        String password= "", pass= "UTN";
        int intentos=0;
        while (!password.equals(pass) && intentos <4 ){

            password = JOptionPane.showInputDialog("Ingrese su contraseña \n Intento numero " + (intentos+1)).toUpperCase();
            intentos++;
            if (intentos >= 3){
                JOptionPane.showMessageDialog(null,"Limite de intentos alcanzado");
                break;
            }else if (password.equals(pass)){
                JOptionPane.showMessageDialog(null,"Ha iniciado sesion correctamente");
                break;
            }
        }
    }
}
