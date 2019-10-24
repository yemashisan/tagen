package com.tianjian.web.service.parkservice;


import java.util.List;
import java.util.Map;

import com.tianjian.web.entity.park.ParkMonthCard;

/**
 *  @Description 接口
 * @Author: liangxiaolei
 * @Date: 2019-05-17 14:00:25
 */

public interface ParkMonthcardService {
	/**
	 * fetch data by  monthcardid
	 * @param  param
	 * @return 单个月卡
	 */


	public List<Map<String, Object>> selectByPrimaryKey(Map<String, Object> param);
	/**
	 * fetch data by  monthcardid
	 * @param param
	 * @return 月卡集合
	 */
	List<Map<String, Object>> cardList(Map<String, Object> param);
}
