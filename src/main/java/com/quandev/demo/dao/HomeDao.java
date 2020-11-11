/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.dao;

import com.quandev.demo.entities.Categories;
import com.quandev.demo.entities.CategoryPost;
import com.quandev.demo.entities.Config;
import com.quandev.demo.entities.ConfigHome;
import com.quandev.demo.entities.Menus;
import com.quandev.demo.entities.Orderdetails;
import com.quandev.demo.entities.Products;
import com.quandev.demo.entities.Slides;
import java.util.List;
import com.quandev.demo.entities.Orders;
import com.quandev.demo.entities.Posts;
import javax.servlet.http.HttpSession;

/**
 *
 * @author thang
 */
public interface HomeDao {

  public List<Menus> getMainMenu();

  public List<Categories> getMenuListCategorys();

  public List<CategoryPost> getMenuListCategoryPost();

  public List<Menus> getParentsMenu(int id);

  public List<Slides> getSliderHome();

  public ConfigHome getConfigHomeId(int id);

  public List<Products> getCollectionHome(int id);

  public List<Posts> getCollectionBlog(int id);

  public Config getConfigFooter(int id);

  public boolean sendOrderCheckOut(Orders order, HttpSession sessions);

}
