package com.cc.txlcn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cc.txlcn.dao.TxOneDao;
import com.cc.txlcn.model.TxOne;
import com.cc.txlcn.service.TxOneService;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;

@Service
public class TxOneServiceImpl implements TxOneService{

	@Resource
	private TxOneDao txOneDao;

	@Override
	@Transactional
	@LcnTransaction
	public boolean insert(TxOne txOne) {
		return txOneDao.insert(txOne);
	}
}
