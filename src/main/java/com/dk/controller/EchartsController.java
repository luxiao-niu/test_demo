package com.dk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Deacription TODO
 * @Author 陆小军
 * @Date 2021/1/7 10:04
 * @Version 1.0
 **/
@Controller
@RequestMapping("echarts")
public class EchartsController {

    @RequestMapping("toEcharts")
    public String toEcharts(){
        return "echarts";
    }
    @RequestMapping("getData")
    @ResponseBody
    public Map<String,Object> getData(){
        Map<String,Object> map = new HashMap<>();
        String[] categories = {"牛","羊","龙","蛇","狗","鸡"};
        int[] data = {4,8,16,14,24,28};
        int[] data1 = {2,10,12,17,22,30};
        map.put("categories",categories);
        map.put("data",data);
        map.put("data1",data1);
        return map;
    }
    @RequestMapping("getData1")
    @ResponseBody
    public Map<String,Object> getData1(){
        Map<String,Object> map = new HashMap<>();
        String[] categories = {"牛","羊","龙","蛇","狗","鸡"};
        int[] data = {4,8,16,14,24,28};
        map.put("type",categories);
        map.put("data",data);
        return map;
    }
}
