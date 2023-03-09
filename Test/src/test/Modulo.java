/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author Dell
 */
public class Modulo {
    public void MenuAdmin(){
        ClsHelper clsH = new ClsHelper();
        Modulo clsM = new Modulo();
        char opcion = ' ';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion\n"
             + "A. \n"
             + "B. \n"
             + "C. \n"
             + "D. \n"
             + "E. \n"       
             + "S. \n");
           switch(opcion){
               case 'A':
                  break;
               case 'B':
                  break;
               case 'C':
                  break;
               case 'D':
                  break;
               case 'E':
                   break;
               case 'S':
                   clsH.imprimeMensaje("Gracias por utilizar nuestra aplicacion");
                   break;
               default:
                   clsH.imprimeMensaje("Opcion incorrecta intente nueva mente");
                   break;
                   
           }                   
        } while (opcion != 'S' && opcion != 's');
    } 
    
    public void MenuUsuario(){
        ClsHelper clsH = new ClsHelper();
        registrarUsuario newUser = new registrarUsuario();
        char opcion = ' ';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion\n"
             + "A. Modulo Seguridad\n"
             + "B. Modulo Caja\n"
             + "C. Modulo Ingreso de clientes\n" // Registro Nuevos Clientes / Usuarios???
             + "D. Modulo Ingreso al cajero\n"
             + "E. Modulo Pantalla de bienvenida\n"
             + "F. Modulo Ingreso de dinero\n"
             + "G. Modulo extracion de dinero\n"
             + "H. ModuloTransferencia de dinero\n"                   
             + "S. Salir\n");
           switch(opcion){
               case 'A':
                 
                  break;
               case 'B':
                  break;
               case 'C':
                   newUser.registrarUsuario();
                  break;
               case 'D':
                  break;
               case 'E':
                   break;
               case 'F':
                   break;
               case 'G':
                   break;
               case 'H':
                   break;
               case 'S':
                   clsH.imprimeMensaje("Gracias por utilizar nuestra aplicacion");
                   break;
               default:
                   clsH.imprimeMensaje("Opcion incorrecta intente nueva mente");
                   break;
                   
           }                   
        } while (opcion != 'S' && opcion != 's');
    }
    
}
