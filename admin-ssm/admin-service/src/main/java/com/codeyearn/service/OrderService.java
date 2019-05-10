package com.codeyearn.service;


import com.codeyearn.pojo.Order;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:26
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
public interface OrderService {

    List<Order> getAllOrder(Integer pageNumber, Integer pageSize);

    Order getOrderByID(Integer orderID);
}
