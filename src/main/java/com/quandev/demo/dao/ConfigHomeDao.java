/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.dao;

import com.quandev.demo.entities.Categories;
import com.quandev.demo.entities.CategoryPost;
import com.quandev.demo.entities.ConfigHome;
import com.quandev.demo.entities.Posts;
import java.util.List;

/**
 *
 * @author thang
 */
public interface ConfigHomeDao {

  public ConfigHome getConfigHome(int id);

  public boolean updateConfigHome(ConfigHome config);

  public List<Categories> getCategoryListHome();

  public List<CategoryPost> getCategoryPostListHome();
}
