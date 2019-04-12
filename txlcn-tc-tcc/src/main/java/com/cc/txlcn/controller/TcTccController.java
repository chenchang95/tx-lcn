package com.cc.txlcn.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.txlcn.service.TcTccService;

@RestController
public class TcTccController {

	@Resource
	private TcTccService tcTccService;
	
	@RequestMapping("/tcc")
	public String tcc(@RequestParam("name") String name){
		tcTccService.insertTcc(name);
		return "tcc -> ok";
	}
}
