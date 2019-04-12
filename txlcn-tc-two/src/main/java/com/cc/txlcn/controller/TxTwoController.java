package com.cc.txlcn.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.txlcn.model.TxTwo;
import com.cc.txlcn.service.TxTwoService;

@RestController
@RequestMapping("/two")
public class TxTwoController {

	@Resource
	private TxTwoService txTwoService;
	
	@RequestMapping("/insert")
	public String insert(@RequestParam("name") String name){
		TxTwo txTwo = new TxTwo();
		txTwo.setId(UUID.randomUUID().toString().replace("-", ""));
		txTwo.setName(name);
		txTwoService.insert(txTwo);
		return "insert two -> ok";
	}
	
}
