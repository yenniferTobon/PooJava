package models;
import java.util.ArrayList;
import java.util.List;
public class Usuario1 {   
   public static List<Usuario1> usuarios = new ArrayList<Usuario1>(){
       {add(new Usuario1(1,"Andres perez","xxx"));
           add(new Usuario1(2,"Gio Cardona","22"));
           add(new Usuario1(3,"Yennifer Tobon","xxx"));}
   };   
   private int id;
   private String name;
   private String price;

    public Usuario1(int id, String name, int price) {
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
   public Usuario1(int id, String name, String price) {
       this.id = id;
       this.name = name;
       this.price = price;
   }    
   public Usuario1 getProduct(int pos) {
       return usuarios.get(pos);
   }
}



