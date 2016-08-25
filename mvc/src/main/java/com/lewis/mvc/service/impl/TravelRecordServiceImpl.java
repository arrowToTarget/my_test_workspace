package com.lewis.mvc.service.impl;

import com.lewis.mvc.dao.ITravelRecordDao;
import com.lewis.mvc.service.ITravelRecordService;
import com.lewis.mvc.vo.TravelRecord;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangminghua on 2016/8/25.
 */
@Service
public class TravelRecordServiceImpl implements ITravelRecordService {

    @Resource
    private ITravelRecordDao travelRecordDao;

    public List<TravelRecord> queryAllTravelRecord() {
        return travelRecordDao.queryAllTravelRecord();
    }
}
