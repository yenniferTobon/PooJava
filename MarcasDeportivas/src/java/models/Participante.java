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
public class Participante extends Usuario {

    private String nombre;
    private long documento;
    private int edad;
    private String genero;

   
    public Participante(String contrasena, String correo, String nombre, long documento, int edad, String genero) throws IOException {
        super(correo, contrasena);
        this.nombre = nombre;
        this.documento = documento;
        this.edad = edad;
        this.genero = genero;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   // public static String participante_mayor_edad(ArrayList<Participante> participantes) {
   //    Participante participante_mayor = new Participante();
   //  for (Participante i : participantes) {
   //    if (i.edad > participante_mayor.edad) {
   //      participante_mayor = i;

   //}

   // }
   //  return (participante_mayor.nombre + " " + String.valueOf(participante_mayor.edad));

   // }

}
