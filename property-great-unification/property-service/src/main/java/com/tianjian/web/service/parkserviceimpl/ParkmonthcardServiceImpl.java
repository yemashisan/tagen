package com.tianjian.web.service.parkserviceimpl;

import com.tianjian.web.service.parkservice.ParkMonthcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import  com.tianjian.web.entity.park.ParkMonthCard;
import com.tianjian.web.dao.park.ParkmonthcardMapper;

import java.util.List;
import java.util.Map;

@Service
public class ParkmonthcardServiceImpl implements ParkMonthcardService {
	@Autowired
	private ParkmonthcardMapper parkmonthcardMapper;

/*	@Override
	public ParkMonthCard selectByPrimaryKey(Integer monthcardid) {
		ParkMonthCard  parkmonthcard=null;
		parkmonthcard=parkmonthcardMapper.selectByPrimaryKey(monthcardid);
		return parkmonthcard;
	}*/

	@Override
	public List<Map<String, Object>> selectByPrimaryKey(Map<String, Object> param) {
		List<Map<String, Object>> cardone=  parkmonthcardMapper.selectByPrimaryKey(param);
		return cardone;
	}

	@Override
	public List<Map<String, Object>> cardList(Map<String, Object> param) {

		List<Map<String, Object>> cardlist=  parkmonthcardMapper.cardList(param);
		return cardlist;
	}


}
