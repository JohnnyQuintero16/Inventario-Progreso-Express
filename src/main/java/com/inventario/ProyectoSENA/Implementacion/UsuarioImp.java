/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inventario.ProyectoSENA.Implementacion;

import com.inventario.ProyectoSENA.DAO.UsuarioDAO;
import com.inventario.ProyectoSENA.Modelo.Usuario;
import com.inventario.ProyectoSENA.Servicio.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author johnny
 */

@Component
public class UsuarioImp implements UsuarioService{

    @Autowired()
    UsuarioDAO usuarioDAO;
    
    @Override
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) this.usuarioDAO.findAll();
    }

    @Override
    public void guardarUsuario(Usuario usuario) {
        this.usuarioDAO.save(usuario);
    }

    @Override
    public boolean encontrarUsuario(int id) {
        if(this.usuarioDAO.findById(id) != null)
            return true;
        return false;
    }
}
