package com.hangchuang.house.mapper;

import com.hangchuang.house.vo.AreaVo;

import java.util.List;

public interface AreaMapper {

    //查询都有哪些区域,获得区域信息,找到所有的市级
    List<AreaVo> selectAllArea();


}