/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu1;

/**
 *
 * @author Dell
 */
public class Menu1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClsHelper clsH = new ClsHelper();
        
        
        
        char Modulo = ' ';
        do {
            Modulo = clsH.recibeChar("Seleccione una opcion\n"
             + "A. Modulo seguridad\n"
             + "B. Modulo Ingreso o Extraccion de Dinero\n"
             + "C. \n"
             + "D. \n"
             + "E. \n"       
             + "S. Salir\n");
           switch(Modulo){
               case 'A':
                    char opcion = ' ';
        do {
            Modulo = clsH.recibeChar("Seleccione una opcion\n"
             + "A. Modulo Nuevo Usuario\n"
             + "B. Mudulo Editar Usuario\n"
             + "C. Modulo Eliminar Usuario(Deshabilitar)\n"     
             + "S. Salir\n");
           switch(opcion){
               case 'A':
                   
                   
               break;
               case 'B':
                 
                   
               break;
               case 'C':
                  
                   
                   break;
               case 'S':
                   clsH.imprimeMensaje("Gracias por utilizar nuestra aplicacion");
                   break;
               default:
                   clsH.imprimeMensaje("Opcion incorrecta intente nueva mente");
                   break;
              
                   
                 break;
               case 'B';    
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
    } 


        
        
    
    

