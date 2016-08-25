package com.lewis.mvc;

import com.lewis.mvc.dao.ITravelRecordDao;
import com.lewis.mvc.service.ITravelRecordService;
import com.lewis.mvc.vo.TravelRecord;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhangminghua on 2016/8/25.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @Resource
    private ITravelRecordService travelRecordService;

    @RequestMapping("/say")
    @ResponseBody
    public String sayHello(@RequestParam  String name){
        List<TravelRecord> travelRecords = travelRecordService.queryAllTravelRecord();
        return "hello !"+name +" record:"+travelRecords.toString();
    }
}
