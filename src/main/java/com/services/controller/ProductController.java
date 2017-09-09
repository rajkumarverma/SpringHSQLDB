package com.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.services.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productservice;
	@RequestMapping(value = "/getProducts", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getProducts(){
		System.out.println("Inside getProduct Contorller");
		productservice.getProducts();
		return "Success";
	}

}
