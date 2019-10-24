package com.tianjian.web.proppertytschedules.controller.parkcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.tianjian.web.entity.park.ParkMonthCard;
import com.tianjian.web.service.parkservice.ParkMonthcardService;

import com.tianjian.web.entity.common.Constant;
/**
  * @Author: liangxiaolei
  * @Date: 2019-05-17 14:00:25
  */
@RestController
@RequestMapping(Constant.RESTFUL_PATH1+ "/monthcard")
public class ParkmonthcardController {
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(ParkmonthcardController.class);
	@Autowired
	private ParkMonthcardService parkmonthcardservice;


	@RequestMapping(value = "monthcard", method = RequestMethod.GET)
	public Map<String, Object> monthcar(HttpServletRequest request, HttpServletResponse response) {
		logger.info("ok!");
        Map<String, Object> map = new HashMap<String, Object>(16);
        Map<String, Object> mapdata = new HashMap<String, Object>(16);
        mapdata.put("remark","单个参数");
        map.put("data",mapdata);
		// 时间戳
        String timestamp = System.currentTimeMillis() / 1000 + "";
		//时间戳
        map.put("timestamp",timestamp);
		//返回错误码，为0表示没有错误
        map.put("errcode",0);
		//返回错误提示，会根据参数返回不同的说明
        map.put("msg ","查询正确！");
		return map;
	}

	
	
	@RequestMapping(value = "monthcardone", method = RequestMethod.GET)
	public Map<String, Object> monthcardone(HttpServletRequest request, HttpServletResponse response,

			@RequestParam(value = "monthcardtid", required = false) Integer monthcardid) {
		Map<String, Object> map = new HashMap<String, Object>(16);
		Map<String, Object> mapdata = new HashMap<String, Object>(16);
		//ParkMonthCard parkmonthcard = null;
		List<Map<String, Object>> mapresults = null;
		Map<String, Object> param = new HashMap<String, Object>(16);
		param.put("monthcardid",monthcardid);
		mapresults=	parkmonthcardservice.selectByPrimaryKey(param);
		if (mapresults.size()>0) {
			mapdata.put("carno", mapresults.get(0).get("carNo"));
			mapdata.put("propertyid", mapresults.get(0).get("propertyid"));
			mapdata.put("paytime", mapresults.get(0).get("PayTime"));
			mapdata.put("createstatus", mapresults.get(0).get("CreateStatus"));
		}
		map.put("data",mapdata);
      // 时间戳
		String timestamp = System.currentTimeMillis() / 1000 + "";
		//时间戳
		map.put("timestamp",timestamp);
		//返回错误码，为0表示没有错误
		map.put("errcode",0);
		//返回错误提示，会根据参数返回不同的说明
		map.put("msg ","查询正确！");
		return map;
	}


   @RequestMapping(value = "monthcardlist", method = RequestMethod.GET)
    public Map<String, Object> monthcardlsit(HttpServletRequest request, HttpServletResponse response
         ) {
        Map<String, Object>  map = new HashMap<String, Object>(16);
        Map<String, Object> mapdata = new HashMap<String, Object>(16);
        ParkMonthCard parkmonthcard = null;
       Map<String, Object>  param = new HashMap<String, Object>(16);
       param.put("startTime","'2019-05-12 00:00:00'"); param.put("endTime","'2019-05-16 00:00:00'");


        List<Map<String, Object>> cardlist=	parkmonthcardservice.cardList(param);
       mapdata.put("cardlist",cardlist);
        map.put("data",mapdata);
        String timestamp = System.currentTimeMillis() / 1000 + "";
	   //时间戳
        map.put("timestamp",timestamp);
	   //返回错误码，为0表示没有错误
        map.put("errcode",0);
	   //返回错误提示，会根据参数返回不同的说明
        map.put("msg ","查询正确！");
        return map;
    }
}
