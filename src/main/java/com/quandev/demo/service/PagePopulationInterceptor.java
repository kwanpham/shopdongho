/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quandev.demo.service;

import com.quandev.demo.dao.HomeDao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ngoc Hoan
 */
public class PagePopulationInterceptor implements HandlerInterceptor {
   private HomeDao homeDao;

  @Autowired
  public void setHomeDAO(HomeDao homeDao) {
    this.homeDao = homeDao;
  }
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        modelAndView.addObject("myUserProfile", homeDao.getMainMenu());
    }
}
