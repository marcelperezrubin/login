package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    
    // va llamar a la controladora de persistencia
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public Controladora() {
        controlPersis = new ControladoraPersistencia();
    }
    
    

    public String validarUsuario(String usuario, String contrasenia) {
        
        
        String mensaje = "";
        List<Usuario> listaUsuarios = controlPersis.traerUsuarios();
        for (Usuario usu : listaUsuarios) {
           // para probar si esta funcionando System.out.println("Usuario: " + usu.getNombreUsuario());
        if (usu.getNombreUsuario().equals(usuario)) {
           // para probar si esta funcionando System.out.println("Usuario: " + usu.getNombreUsuario());
            
            // para probar si esta funcionando System.out.println("Contraseña: " + usu.getContraseña());
            if(usu.getContraseña().equals(contrasenia)) {
            // para probar si esta funcionando System.out.println("Contraseña: " + usu.getContraseña());
            mensaje = "Usuario y contraseña correctos.";
            return mensaje;
            }
            else {
            mensaje = "Contraseña incorrecta";
            }
        }
        
        else{
        mensaje = "usuario no encontrado";
        }
      } 
        
        return mensaje;
   }
}
