package com.cc.txlcn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cc.txlcn.dao.TxThreeDao;
import com.cc.txlcn.model.TxThree;
import com.cc.txlcn.service.TxThreeService;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;

@Service
public class TxThreeServiceImpl implements TxThreeService{

	@Resource
	private TxThreeDao txThreeDao;

	@Override
	@Transactional
	@TxcTransaction
	public boolean insert(TxThree txOne) {
		return txThreeDao.insert(txOne);
	}
}
