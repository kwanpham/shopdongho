/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.dao;

import com.quandev.demo.entities.Config;
import com.quandev.demo.entities.Menus;
import com.quandev.demo.entities.Posts;
import com.quandev.demo.entities.Products;
import java.util.List;

/**
 *
 * @author thang
 */
public interface ConfigDao {
  public Config getConfig(int id);
  public boolean updateConfig(Config config);
  public List<Menus> getMenuConfig();
  
  
  public long getTotalProduct();
  public long getTotalPost();
  public long getTotalUser();
  
  public List<Products> getProductNew();
  public List<Posts> getPostNew();
}
