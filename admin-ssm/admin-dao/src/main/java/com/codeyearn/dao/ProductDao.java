package com.codeyearn.dao;

import com.codeyearn.pojo.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 11:29
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface ProductDao {

    @Select("select * from tb_product where productID = #{productID}")
    Product getProductByID(Integer productID);

    @Select("select * from tb_product")
    List<Product> getAllProduct();

    @Insert("insert into " +
            "tb_product " +
            "values(null," +
            "#{productName}," +
            "#{city},#{time}," +
            "#{productPrice}," +
            "#{productDescription}," +
            "#{productStatus})")
    void postProduct(Product product);

}
