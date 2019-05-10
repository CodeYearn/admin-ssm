package com.codeyearn.controller;

import com.codeyearn.pojo.Product;
import com.codeyearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 13:28
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/getAllProduct.do")
    public ModelAndView getAllProduct(){
        ModelAndView mv = new ModelAndView();
        List<Product> allProduct = productService.getAllProduct();
        mv.addObject("productList",allProduct);
        mv.setViewName("product-list");
        return mv;
    }

    @RequestMapping("/postProduct.do")
    public String postProduct(Product product){
        System.out.println("product: " + product);
        productService.postProduct(product);
        return "redirect:/product/getAllProduct.do";
    }

}
