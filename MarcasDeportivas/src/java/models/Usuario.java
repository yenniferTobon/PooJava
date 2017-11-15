/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Asus
 */
public class Usuario {
    private String correo;
    private String contrasena;
    public static List<Usuario> usuarios = new ArrayList<>();
 
    

    public Usuario(String correo, String contrasena) throws IOException{
        this.setCorreo(correo);
        this.setContrasena(contrasena);
    }

    public Usuario() {
        super();
    }

    public String getContrasena() {
        return contrasena;
    }
    
    public String getCorreo() {
        return correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
      public Boolean verificarCorreo(String email) {
        for (Usuario u : usuarios) {            
            if (u.getCorreo().equals(correo)){
                return false;
            }            
        }return true;
    }
    
}