/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.dao;

import com.quandev.demo.entities.Contacs;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface ContacsDao {
  List<Contacs> getAllContac();
  public Contacs getContacById(int id);
  public boolean insert(Contacs contacs);
  public boolean delete(int id);
}
