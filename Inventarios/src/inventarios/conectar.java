/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventarios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ester
 */
public class conectar {
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String URL="jdbc:mysql://localhost:3308/inventario";
    private static final String USERNAME="root";
    private static final String PASSWORD="";

    public conectar() {
        conn = null;
        try{
            Class.forName(driver);
            conn=(Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    
}
