/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Odual
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu();
    }    

    private static void Menu() {
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
    }
}
   