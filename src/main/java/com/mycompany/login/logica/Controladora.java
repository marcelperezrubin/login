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
    boolean usuarioEncontrado = false;
    
    for (Usuario usu : listaUsuarios) {
        if (usu.getNombreUsuario().equals(usuario)) {
            usuarioEncontrado = true;
            if (usu.getContraseña().equals(contrasenia)) {
                mensaje = "Usuario y contraseña correctos.";
            } else {
                mensaje = "Contraseña incorrecta";
            }
            // Si se encontró el usuario y se validó la contraseña, salir del bucle
            break;
        }
    }
    
    if (!usuarioEncontrado) {
        mensaje = "Usuario no encontrado";
    }
    
    return mensaje;
}
}
