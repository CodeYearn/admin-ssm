package com.codeyearn.controller;

import com.codeyearn.pojo.Order;
import com.codeyearn.service.OrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 19:33
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /*@RequestMapping("/getAllOrder.do")
    public ModelAndView getAllOrder(){
        ModelAndView mv = new ModelAndView();
        List<Order> allOrder = orderService.getAllOrder();
        mv.addObject("orderList",allOrder);
        mv.setViewName("orders-list");
        return mv;
    }*/

    @RequestMapping("/getAllOrder.do")
    public ModelAndView getAllOrder(@RequestParam(name = "pageNumber",required = true,defaultValue = "1") Integer pageNumber,
                                    @RequestParam(name = "pageSize",required = true,defaultValue = "5") Integer pageSize){
        ModelAndView mv = new ModelAndView();
        List<Order> allOrderList = orderService.getAllOrder(pageNumber,pageSize);
        PageInfo pageInfo = new PageInfo(allOrderList);
        mv.addObject("pageInfo",pageInfo);
        mv.setViewName("orders-page-list");
        return mv;
    }

    @RequestMapping("/getOrderByID.do")
    public ModelAndView getOrderByID(@RequestParam(name = "orderID",required = true) Integer orderID){
        ModelAndView mv = new ModelAndView();
        Order order = orderService.getOrderByID(orderID);
        mv.addObject("order",order);
        System.out.println("order: " + order);
        mv.setViewName("orders-show");
        return mv;
    }

}
