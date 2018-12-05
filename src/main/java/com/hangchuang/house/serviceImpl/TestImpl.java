package com.hangchuang.house.serviceImpl;

import com.hangchuang.house.mapper.AdminLogMapper;
import com.hangchuang.house.pojo.AdminLog;
import com.hangchuang.house.sevice.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestImpl implements Test{

    @Autowired
    private AdminLogMapper adminLogDao;

    @Override
    public List<AdminLog> selectAll() {
        List<AdminLog> adminLogs = adminLogDao.selectAll();
        return adminLogs;
    }
}
