package com.cc.txlcn.service.impl;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cc.txlcn.dao.TxTwoDao;
import com.cc.txlcn.model.TxTwo;
import com.cc.txlcn.service.TxTwoService;
import com.codingapi.txlcn.tc.annotation.DTXPropagation;
import com.codingapi.txlcn.tc.annotation.TccTransaction;

@Service
public class TxTwoServiceImpl implements TxTwoService{

	private ConcurrentHashMap<String, String> ids = new ConcurrentHashMap<>();
	
	@Resource
	private TxTwoDao txTwoDao;
	
	@Override
	@Transactional
	@TccTransaction(propagation = DTXPropagation.SUPPORTS)
	public boolean insert(TxTwo txTwo) {
		ids.put(txTwo.getId(), txTwo.getName());
		return txTwoDao.insert(txTwo);
	}
	
	public void confirmInsert(TxTwo txTwo) {
        ids.remove(txTwo.getId());
    }

    public void cancelInsert(TxTwo txTwo) {
    	txTwoDao.deleteByKId(txTwo.getId());
    }

}
