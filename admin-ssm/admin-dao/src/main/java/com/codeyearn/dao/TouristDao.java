package com.codeyearn.dao;

import com.codeyearn.pojo.Tourist;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 22:26
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface TouristDao {

    @Select("select * from tb_tourist where touristID in (select touristID from tb_order_tourist where orderID = #{orderID})")
    List<Tourist> getTouristByOrderID(int orderID);

}
