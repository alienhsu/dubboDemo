package com.alienhsu.servicesImpl;

import java.io.Serializable;

import com.alienhsu.dubboDemoInterface.DemoService;

public class DemoServiceImpl implements DemoService,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7531376013954644575L;

	public String sayHello(String name) {
		return "Hello Dubbo,Hello " + name;
	}
}
