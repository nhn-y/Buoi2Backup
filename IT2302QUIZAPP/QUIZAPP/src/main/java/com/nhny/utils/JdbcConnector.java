/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhny.utils;

/**
 *
 * @author admin
 */
public class JdbcConnector {
   private static JdbcConnector instance;

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   private final Connection conn;
   
   static {
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   private JdbcConnector() {
       this.con = DriverManager.getConnection ("jbdc:mysql://localhost/quizdb", "root", "root");
   }
   
   public static JdbcConnector getInstance() {
       if (instance ==null)
           instance = new JdbcConnector();
       return instance;
   }
   
   public Connection connect () {
       return this.conn;
   }
   
   public void close () // throws SQLException
   {
       if (this.conn != null)
           this.conn.close();
   }
}
