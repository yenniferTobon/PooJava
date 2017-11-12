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
public class Administrador extends Usuario{
     public static List<Administrador> admins = new ArrayList<>();

    public Administrador(String correo, String contrasena)  throws IOException {
        super(correo,contrasena);
    }
    
}
