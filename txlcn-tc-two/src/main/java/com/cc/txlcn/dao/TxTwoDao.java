package com.cc.txlcn.dao;

import com.cc.txlcn.model.TxTwo;

public interface TxTwoDao {

	public boolean insert(TxTwo txTwo);
	
	public int deleteByKId(String id);
}
