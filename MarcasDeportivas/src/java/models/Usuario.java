package models;
import java.util.ArrayList;
import java.util.List;
public class Usuario {   
   public static List<Usuario> usuarios = new ArrayList<Usuario>(){
       {add(new Usuario(1,"Andres perez","xxx"));
           add(new Usuario(2,"Gio Cardona","22"));
           add(new Usuario(3,"Yennifer Tobon","xxx"));}
   };   
   private int id;
   private String name;
   private String price;

    public Usuario(int id, String name, int price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   } 
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   } 
   public String getPrice() {
       return price;
   }
   public void setPrice(String price) {
       this.price = price;
   }
   public Usuario(int id, String name, String price) {
       this.id = id;
       this.name = name;
       this.price = price;
   }    
   public Usuario getProduct(int pos) {
       return usuarios.get(pos);
   }
}



