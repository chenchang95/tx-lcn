package com.cc.txlcn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cc.txlcn.service.TcTccService;
import com.cc.txlcn.service.client.TxOneService;
import com.cc.txlcn.service.client.TxThreeService;
import com.cc.txlcn.service.client.TxTwoService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;

@Service
public class TcTccServiceImpl implements TcTccService{

	@Resource
	private TxOneService txOneService;
	
	@Resource
	private TxTwoService txTwoService;
	
	@Resource
	private TxThreeService txThreeService;
	
	@Override
	@Transactional
	@LcnTransaction
	public void insertTcc(String name) {
		String oneFlag = txOneService.insert(name);
		System.out.println(String.format("one save success :[%s]" , oneFlag));
		String twoFlag = txTwoService.insert(name);
		System.out.println(String.format("two save success :[%s]" , twoFlag));
		String threeFlag = txThreeService.insert(name);
		System.out.println(String.format("two save success :[%s]" , threeFlag));
		throw new RuntimeException("分布式事务回滚");
	}

}
