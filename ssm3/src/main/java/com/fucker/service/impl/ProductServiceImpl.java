package com.fucker.service.impl;

import com.fucker.dao.ProductDao;
import com.fucker.pojo.Product;
import com.fucker.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    private ProductDao productDao;

    @Override
    public List<Product> findAll() {
        return productDao.selectAll();
    }
}
