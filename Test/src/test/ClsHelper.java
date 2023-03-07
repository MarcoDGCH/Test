/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ClsHelper {
    public int recibeint(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        int valor = Integer.parseInt(auxiliar);
        return valor;
                
    }
     public float recibeFloat(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        float valor = Float.parseFloat(auxiliar);
        return valor;
                
    } 
     public char recibeChar(String mensajeUsuario){
        String auxiliar = JOptionPane.showInputDialog(mensajeUsuario);
        char valor = auxiliar.charAt(0);
        return valor;
                
    }
     public String recibeString(String mensajeUsuario){
        String valor = JOptionPane.showInputDialog(mensajeUsuario);
        return valor;
                
    }
     public void imprimeMensaje(String mensajeUsuario){
        JOptionPane.showInputDialog(null, mensajeUsuario);
                
    }
    
}
