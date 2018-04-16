/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

/**
 *
 * @author Home
 */
public class controller {

private static final String url = "jdbc:postgresql://localhost:5432/library";
private static final String user = "postgres";
private static final String password = "211085";

 //public static Connection connect() {
    public static ArrayList<String> getlibrary() {
        Connection conn = null;
        ArrayList<String> lib_names= new ArrayList<String>();
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM library");
             ResultSet rs = pstmt.executeQuery();
             
             int a = 1;
             int b = 2;
             int c = a+b;
             
             
            while (rs.next())
            {
                //String variable = "library_name";
                //String library_name = rs.getString("library_name");
                //lib_names.add(variable); 
              lib_names.add(rs.getString("library_name")); 
            
              String ID_library = rs.getString("ID_library");
              String library_name = rs.getString("library_name");
              System.out.println("ID_library: " + ID_library + " library_name: " + library_name);
              
            
            }
            conn.close();
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lib_names;
        //return conn;
    }
 
     public static Connection connect() {
        Connection conn = null;
        ArrayList<String> lib_names= new ArrayList<String>();
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
        //return conn;
    }
  
  public static Connection connect_datasource() {
      
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            Context initContext = new InitialContext();
            DataSource ds = (DataSource) initContext.lookup("jdbc/library");
            conn = ds.getConnection();
            //conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
 public static void main(String[] args) {
     controller.connect();
        //controller app = new controller();
        //app.connect();
 }
}
