package com.ly.cy.common.service;

import java.util.List;

import com.ly.cy.common.pojo.Activity;

public interface serviceActive {
  List<Activity> selectactivity();
  int deletebyid(Integer id);
}
