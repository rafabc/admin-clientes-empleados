package clases;

//Los ocupas para usar sentencias sql
import java.sql.Connection;
import java.sql.DriverManager;

//Clase para conectar base de daros
public class conectar {
    Connection conectar=null;//declaras la conexion.
    
          
   //para poder conectar a la base de datos
    public Connection conexion(){
     try {
      //  Class.forName("oracle.jdbc.OracleDriver");//driver
        //conectar=DriverManager.getConnection(url,login,password);//son las variables de arriba
        Class.forName("com.mysql.jdbc.Driver");
         conectar=DriverManager.getConnection("jdbc:mysql://localhost/pdigital","root","");
      } 
     catch (Exception e) {//por si pasa un error
          System.out.print(e.getMessage());//mensaje de error
        }
        return conectar;//regresa el resultado (manda)
    }
    
}
