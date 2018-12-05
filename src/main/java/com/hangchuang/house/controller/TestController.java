package com.hangchuang.house.controller;

import com.hangchuang.house.pojo.AdminLog;
import com.hangchuang.house.sevice.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.H;

@RestController
@RequestMapping("/house")
public class TestController {
    @Autowired
    private Test test;

    @RequestMapping(value = "/test")
    public Map<String, Object> test(){
        Map<String, Object> map = new HashMap<>();
        try {
            List<AdminLog> adminLogs = test.selectAll();
            map.put("data", adminLogs);
        } catch (Exception e) {
            map.put("data", e);
        }

        return map;
    }
}
