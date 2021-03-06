/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.dao;

import com.quandev.demo.entities.Categories;
import com.quandev.demo.entities.CategoryPost;
import com.quandev.demo.entities.Menus;
import java.util.List;

/**
 *
 * @author thang
 */
public interface MenuDao {

  public List<Menus> getAllMenu(Integer offset, Integer maxResults);

  public List<Menus> getDataMenuParents();

  public List<Categories> ajaxGetDataCategory();

  public List<CategoryPost> ajaxGetDataCategoryPost();

  public long getTotalMenu();

  public boolean insertMenu(Menus menu);

  public Menus getMenuById(int id);

  public boolean updateMenu(Menus menu);

  public boolean deleteMenu(int id);
}
