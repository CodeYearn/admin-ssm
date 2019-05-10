package com.codeyearn.service;

import com.codeyearn.pojo.Log;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/10 20:30
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface LogService {

    void save(Log log);

    List<Log> getAllLog();

}
