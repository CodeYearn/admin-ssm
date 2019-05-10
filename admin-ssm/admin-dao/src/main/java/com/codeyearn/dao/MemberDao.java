package com.codeyearn.dao;

import com.codeyearn.pojo.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @Author CaiYu
 * @Data 2019/5/7 22:01
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface MemberDao {

    @Select("select * from tb_member where memberID = #{memberID}")
    Member getMemberByID(int memberID);

}
