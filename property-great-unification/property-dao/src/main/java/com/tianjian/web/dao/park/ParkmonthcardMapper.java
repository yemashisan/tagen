package com.tianjian.web.dao.park;

import com.tianjian.web.entity.park.ParkMonthCard;

import java.util.List;
import java.util.Map;

/**
 *  @Description 接口
 * @Author: liangxiaolei
 * @Date: 2019-05-17 14:00:25
 */
public interface ParkmonthcardMapper {
 /*   int deleteByPrimaryKey(Integer monthcardid);

    int insert(ParkMonthCard record);

    int insertSelective(ParkMonthCard record);*/
    /**
     * fetch data by  param
     * @param  param
     * @return   集合
     */
     List<Map<String, Object>> cardList(Map<String, Object> param);
    /**
     * fetch data by  monthcardid
     * @param  param
     * @return   单个
     */
   // ParkMonthCard selectByPrimaryKey(Integer monthcardid);
    public List<Map<String, Object>> selectByPrimaryKey(Map<String, Object> param);

  /*  int updateByPrimaryKeySelective(ParkMonthCard record);

    int updateByPrimaryKey(ParkMonthCard record);*/
}