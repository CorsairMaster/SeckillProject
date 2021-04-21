package com.imooc.miaosha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author lidengjin
 * @Date 2020/6/16 5:28 下午
 * @Version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/getname")
	public String testDemo(String name) {
		return name + System.currentTimeMillis();
	}
}
