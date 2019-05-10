package com.codeyearn.dao;

import com.codeyearn.pojo.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/10 20:34
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface LogDao {

    @Insert("insert into tb_log values(null,#{username},#{ip},#{url},#{method},#{visitTime},#{executionTime})")
    void save(Log log);

    @Select("select * from tb_log")
    List<Log> getAllLog();
}
