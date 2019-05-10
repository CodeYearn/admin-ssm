package com.codeyearn.service.impl;

import com.codeyearn.dao.LogDao;
import com.codeyearn.pojo.Log;
import com.codeyearn.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/10 20:31
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service
@Transactional
public class LogServiceImpl implements LogService {

    @Autowired
    private LogDao logDao;

    @Override
    public void save(Log log) {
        logDao.save(log);
    }

    @Override
    public List<Log> getAllLog() {
        return logDao.getAllLog();
    }
}
