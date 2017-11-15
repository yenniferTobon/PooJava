/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Database;

/**
 *
 * @author Asus
 */
@WebServlet(name = "index", urlPatterns = {"/index"})
public class index extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException { 
    
        Database.datos_ficticios();
        HttpSession session =request.getSession();
    
        session.setAttribute("participantes",Database.participantes);
        session.setAttribute("administradores",Database.administradores);
        
       // request.setAttribute("typeView",/"Login");
        response.sendRedirect("/FastOrder/Login");
    
    }
}