package com.hangchuang.house.serviceImpl;

import com.hangchuang.house.mapper.AreaMapper;
import com.hangchuang.house.sevice.AreaService;
import com.hangchuang.house.vo.AreaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaDao;

    @Override
    public List<AreaVo> selectAllArea() {
        List<AreaVo> areaVos = areaDao.selectAllArea();
        return areaVos;
    }
}
