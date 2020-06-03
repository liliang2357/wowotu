package com.ly.cy.common.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.cy.common.dao.activityDao;
import com.ly.cy.common.pojo.Activity;

@Service
public class serviceActive1 implements serviceActive {
    @Autowired
	private activityDao activity;
	@Override
	public List<Activity> selectactivity() {
		// TODO Auto-generated method stub
		List<Activity> selectfind = activity.selectfind();
		 for (Activity activity : selectfind) {
			System.out.println(activity);
		}
		return  selectfind;
		
	}
	@Override
	public int deletebyid(Integer id) {
		// TODO Auto-generated method stub
		int lows = activity.deletefind(id);
		return lows;
	}

}
