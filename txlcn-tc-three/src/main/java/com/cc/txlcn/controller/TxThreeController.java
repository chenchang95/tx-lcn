package com.cc.txlcn.controller;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cc.txlcn.model.TxThree;
import com.cc.txlcn.service.TxThreeService;

@RestController
@RequestMapping("/three")
public class TxThreeController {

	@Resource
	private TxThreeService txThreeService;
	
	@RequestMapping("/insert")
	public String insert(@RequestParam("name") String name){
		TxThree txOne = new TxThree();
		txOne.setId(UUID.randomUUID().toString().replace("-", ""));
		txOne.setName(name);
		txThreeService.insert(txOne);
		return "insert three -> ok";
	}
}
