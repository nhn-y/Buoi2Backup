/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nhny.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

/**
 *
 * @author admin
 */
public class CategoryServices {
    
    public List<Category> getCates () {
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery ("SELECT * FROM category");
        
        List<Category> cates = new ArrayList<> ();
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString ("name");
            
            Category c = new Category (id, name);
            cates.add(c);
        }
    }
}
