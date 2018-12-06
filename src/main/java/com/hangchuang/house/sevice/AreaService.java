package com.hangchuang.house.sevice;

import com.hangchuang.house.vo.AreaVo;

import java.util.List;

public interface AreaService {

    //查询所有的地区信息，用于选择地址
    public List<AreaVo> selectAllArea();
}
