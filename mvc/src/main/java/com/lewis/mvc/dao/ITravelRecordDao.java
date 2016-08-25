package com.lewis.mvc.dao;


import com.lewis.mvc.vo.TravelRecord;

import java.util.List;

/**
 * Created by zhangminghua on 2016/3/28.
 */
public interface ITravelRecordDao {

    List<TravelRecord> queryAllTravelRecord();
}
