package com.codeyearn.service;

import com.codeyearn.pojo.Product;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 11:35
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface ProductService {

    List<Product> getAllProduct();

    void postProduct(Product product);

}
