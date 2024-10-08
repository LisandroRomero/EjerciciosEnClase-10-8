import javax.swing.*;

public class Dowhile {
    public static void main(String[] args) {
        int notaExamen = 0, intentos = 0;
        do {
            notaExamen = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del intento N°"+(intentos+1)));
            intentos++;
            JOptionPane.showMessageDialog(null,"Le quedan " +(4-intentos) +" intentos");
            if (notaExamen>60){
                JOptionPane.showMessageDialog(null,"Usted aprobó la materia");
                break;
            } else if (intentos >=4) {
                JOptionPane.showMessageDialog(null,"Limite de intentos alcanzados \n Usted recursa la materia");
            }
        }while (notaExamen<60 && intentos<4);
    }
}
