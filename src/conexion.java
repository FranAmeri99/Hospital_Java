import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.*;

public class conexion extends inicio{
    String db="Hospital"; //nombre de la base de datos
    String url="jdbc:mysql://localhost/"+db;
    DefaultTableModel modelo;
    String sSQL="";
    Statement st;
    
    public Connection conectar(String user, String pass){
        Connection link = null;
        try{
            //se le pasan los datos de coneccion a la variable LINK
            link = DriverManager.getConnection(url,user,pass); 
        }
        catch (Exception ex){//se guarda el mensaje de error en [caso de existir] en la variable ex
         // se muestra el mensaje de error guardaddo en la variable ex
            JOptionPane.showMessageDialog(null, ex);
        }  
        return link;
    }       
}