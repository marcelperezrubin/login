package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;


public class ControladoraPersistencia {
    
    //Instancia al JPAController
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    // Con esto le estamos diciendo creame una instancia, asociame al JPAController que esta en la persistencia con la base de datos.

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
        // SELECT ALL FROM USUARIOS
    }
    
    
    
    
}
