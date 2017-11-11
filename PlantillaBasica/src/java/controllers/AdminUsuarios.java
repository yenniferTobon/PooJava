package controllers;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Usuario;
import static models.Usuario.usuarios;
   

@WebServlet(urlPatterns = {"/AdminUsuarios"})
public class AdminUsuarios extends HttpServlet {
    
@Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {   
        
        HttpSession session = request.getSession();         
        List<Usuario> Usuarios= new ArrayList<Usuario>();         
        if(null != session.getAttribute("Usuarios")){
            usuarios=(ArrayList<Usuario>) session.getAttribute("Usuarios");
        }
        
        request.setAttribute("usuarios", usuarios);         
        RequestDispatcher view = request.getRequestDispatcher("ingresoUsuario.jsp");
        view.forward(request, response);         
    }
@Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {  
       
       HttpSession session = request.getSession();        
       List<Usuario> usuarios = new ArrayList<Usuario>();
       if(null != session.getAttribute("Usuarios")){
           usuarios=(ArrayList<Usuario>) session.getAttribute("Usuarios");
       }
       int id = Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       int price = Integer.parseInt(request.getParameter("price")); 
       Usuario p = new Usuario(id,name,price);
       usuarios.add(p);
       
       session.setAttribute("Usuarios", usuarios);
       request.setAttribute("Usuarios", usuarios);        
       RequestDispatcher view = request.getRequestDispatcher("ingresoUsuario.jsp");
       view.forward(request, response);
   }
   }
