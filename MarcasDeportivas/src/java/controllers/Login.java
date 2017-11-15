/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Administrador;
import models.Participante;
import models.Usuario;

/**
 *
 * @author Asus
 */
@WebServlet( urlPatterns = {"/Login"})
public class Login extends HttpServlet {
 @Override
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException { 
       RequestDispatcher view = request.getRequestDispatcher("login.jsp");
       view.forward(request, response);   
   } 
   
 @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {  
       
       HttpSession session = request.getSession();

        String correo = (request.getParameter("correo"));
        String contrasena = (request.getParameter("Contrasena"));   
        ArrayList<Participante> participantes = (ArrayList<Participante>) session.getAttribute("participantes");
        ArrayList<Administrador> administradores = (ArrayList<Administrador>) session.getAttribute("administradores");
        
        if(participantes !=null)
        {
            for(Participante part: participantes) 
            {
                if(part.getCorreo().equals(correo) && part.getContrasena().equals(contrasena))
                {
                 RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
                 view.forward(request, response);
                }
            } 
        }
        
      RequestDispatcher view = request.getRequestDispatcher("Home.jsp");
      view.forward(request, response);   
   }
}  
  



