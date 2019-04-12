package com.cc.txlcn.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.txlcn.model.TxOne;
import com.cc.txlcn.service.TxOneService;

@RestController
@RequestMapping("/one")
public class TxOneController {

	@Resource
	private TxOneService txOneService;
	
	@RequestMapping("/insert")
	public String insert(@RequestParam("name") String name){
		TxOne txOne = new TxOne();
		txOne.setId(UUID.randomUUID().toString().replace("-", ""));
		txOne.setName(name);
		txOneService.insert(txOne);
		return "insert one -> ok";
	}
}
