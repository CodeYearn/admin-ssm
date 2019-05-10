package com.codeyearn.service.impl;

import com.codeyearn.dao.ProductDao;
import com.codeyearn.pojo.Product;
import com.codeyearn.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author CaiYu
 * @Data 2019/5/7 11:40
 * @CurrentGoal 月薪过万, 再挑战年薪20万！
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        return productDao.getAllProduct();
    }

    @Override
    public void postProduct(Product product) {
        productDao.postProduct(product);
    }
}
