package com.hangchuang.house.controller;

import com.hangchuang.house.sevice.AreaService;
import com.hangchuang.house.utils.Result;
import com.hangchuang.house.vo.AreaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/house")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @RequestMapping("/selectAllArea")
    public Result selectAllArea(){

        Result r = new Result();

        List<AreaVo> areaVos = null;
        try {
            areaVos = areaService.selectAllArea();
            r.setData(areaVos);
            r.setStatus(1);
        } catch (Exception e) {
            r.setStatus(0);
            r.setData("失败");
        }
        return r;
    }
}
