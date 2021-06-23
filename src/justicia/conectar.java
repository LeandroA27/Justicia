package justicia;


import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Elvis
 */
public class conectar {

    Connection conect = null;

    public Connection conexion() {


//        if (usu.equals("63a9f0ea7bb98050796b649e85481845") && clave.equals("d53caed9fba320114d009ff88944443f")) {
//
//            String user = "root";
//            String pass = "EAV159704";

            try {

                Class.forName("com.mysql.jdbc.Driver");
                //org.gjt.mm.mysql.Driver

                //conect = DriverManager.getConnection(direccion, usu, clave);

                 conect = DriverManager.getConnection("jdbc:mysql://localhost:3360/consultorio"+"?useSSL=false","root","12345678");
                // conect = DriverManager.getConnection("jdbc:mysql://localhost:3307/prestamos"+"?useSSL=false","root","EAV159704");
                // conect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/prestamos"+"?useSSL=false","root","EAV159704");
                //JOptionPane.showMessageDialog(null,"CONECTADO A LA BASE DE DATOS");
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL SERVIDOR");

            }
            return conect;
//        } else {
//            JOptionPane.showMessageDialog(null, "LOS DATOS DEL ARCHIVO DE CONEXION HAN SIDO MODIFICADOS");
//        }
//        return null;

    }
}
