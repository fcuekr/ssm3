package com.fucker.controller;

import com.fucker.pojo.Product;
import com.fucker.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author CYC
 * @since 1.8
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping("findAll")
    public ModelAndView findAll(HttpServletRequest request){

        ModelAndView modelAndView = new ModelAndView();
        List<Product> products = productService.findAll();
        modelAndView.addObject("products",products);
        System.out.println(products);
        modelAndView.setViewName("list");
        return modelAndView;
    }
}
