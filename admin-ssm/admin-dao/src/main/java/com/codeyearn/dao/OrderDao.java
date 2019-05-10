package com.codeyearn.dao;

import com.codeyearn.pojo.Member;
import com.codeyearn.pojo.Order;
import com.codeyearn.pojo.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:25
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface OrderDao {

    @Select("select * from tb_order")
    @Results({
            @Result(id = true,property = "orderID",column = "orderID"),
            @Result(property = "orderCreateTime",column = "orderCreateTime"),
            @Result(property = "orderPeopleCount",column = "orderPeopleCount"),
            @Result(property = "orderDescription",column = "orderDescription"),
            @Result(property = "orderPayType",column = "orderPayType"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "product",column = "productID", javaType = Product.class,one = @One(select = "com.codeyearn.dao.ProductDao.getProductByID"))
    })
    List<Order> getAllOrder();

    @Select("select * from tb_order where OrderID = #{orderID}")
    @Results({
            @Result(id = true,property = "orderID",column = "orderID"),
            @Result(property = "orderCreateTime",column = "orderCreateTime"),
            @Result(property = "orderPeopleCount",column = "orderPeopleCount"),
            @Result(property = "orderDescription",column = "orderDescription"),
            @Result(property = "orderPayType",column = "orderPayType"),
            @Result(property = "orderStatus",column = "orderStatus"),
            @Result(property = "product",column = "productID", javaType = Product.class,one = @One(select = "com.codeyearn.dao.ProductDao.getProductByID")),
            @Result(property = "member",column = "memberID",javaType = Member.class,one = @One(select = "com.codeyearn.dao.MemberDao.getMemberByID")),
            @Result(property = "touristList",column = "orderID",javaType = List.class,many = @Many(select = "com.codeyearn.dao.TouristDao.getTouristByOrderID"))
    })
    Order getOrderByID(int orderID);

}
