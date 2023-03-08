
package test;
import java.util.HashMap;
public class registrarUsuario {
    public HashMap<String, String> usuariosRegistrados;
    
    public void registrarUsuario() {
        
    ClsHelper clsH = new ClsHelper();
    usuariosRegistrados = new HashMap<String, String>();
    String nombreUsuario;
    String clave;
    
    nombreUsuario= clsH.recibeString("Ingrese su nombre y apellido:");
    clave = clsH.recibeString("Ingrese su clave de ingreso:");
    usuariosRegistrados.put(nombreUsuario, clave);
    
    
    if (usuariosRegistrados.containsKey(nombreUsuario)) {
            if (usuariosRegistrados.get(nombreUsuario).equals(clave)) {
                clsH.imprimeMensaje("Inicio de sesión exitoso.");
            } else {
                clsH.imprimeMensaje("Clave incorrecta.");
            }
        } else {
            clsH.imprimeMensaje("Usuario no registrado.");
        }
    }
    
    /*public void login(){
        registrarUsuario newUser = new registrarUsuario();
    ClsHelper clsH = new ClsHelper();
     clsH.recibeString("Ingrese su nombre y apellido:");
    clsH.recibeString("Ingrese su clave de ingreso:");
    }*/
    
}
