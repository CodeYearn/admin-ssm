package com.codeyearn.service.impl;

import com.codeyearn.dao.OrderDao;
import com.codeyearn.pojo.Order;
import com.codeyearn.service.OrderService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:29
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getAllOrder(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber,pageSize);
        return orderDao.getAllOrder();
    }

    @Override
    public Order getOrderByID(Integer orderID) {
        return orderDao.getOrderByID(orderID);
    }
}
