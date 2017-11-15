/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;
import java.io.IOException;
import java.util.ArrayList;
import models.Participante;
import models.Administrador;
/**
 *
 * @author Asus
 */
public class Database {
    
    
public static ArrayList<Usuario> usuarios = new ArrayList<>();
public static ArrayList<Participante> participantes = new ArrayList<>();
public static ArrayList<Administrador> administradores = new ArrayList<>();

public static void datos_ficticios() throws IOException{
   
    Participante participante1 = new Participante("123","ymtobony@unal.edu.co","Yennifer", 1094, 28,"femenino");
    Participante participante2 = new Participante("456","gio@unal.edu.co","Gio", 8760, 25,"Masculino");
    Participante participante3 = new Participante("789","clao@unal.edu.co","Claudia", 887067, 30,"Femenino");
    
    Administrador administrador1 = new Administrador("435","john@gmail.com");
    
}

}