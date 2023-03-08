
package test;

import javax.swing.JOptionPane;
import java.util.HashMap;

public class main {
 
    public static void main(String[] args) {
         Menu clsM = new Menu();
        clsM.menuPrincipal();

        /*Menu();
    }    

    /*private static void Menu() {
        /*
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Bienvenido al Cajero Automático\n" +
                    "1. Usuario\n" +
                    "2. Administrador\n" +
                    "3. Salir\n\n" +
                    "Seleccione una opción:",
                    "Cajero Automático", JOptionPane.PLAIN_MESSAGE));
            switch (opcion) {
                case 1:
                    String usuario = JOptionPane.showInputDialog(null,
                            "Ingrese su número de cuenta:",
                            "Cajero Automático - Usuario", JOptionPane.PLAIN_MESSAGE);
                    // Aquí iría el código para el menú del usuario
                    break;
                case 2:
                    String admin = JOptionPane.showInputDialog(null,
                            "Ingrese su contraseña:",
                            "Cajero Automático - Administrador", JOptionPane.PLAIN_MESSAGE);
                    // Aquí iría el código para el menú del administrador
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,
                            "Gracias por usar nuestro Cajero Automático",
                            "Cajero Automático", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción inválida. Seleccione otra opción",
                            "Cajero Automático", JOptionPane.PLAIN_MESSAGE);
                    break;
            }
        } while (opcion != 3);
    }*/
}
    
}