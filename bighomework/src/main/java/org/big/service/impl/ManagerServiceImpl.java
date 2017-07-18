package org.big.service.impl;

import org.big.mapper.ManagerMapper;
import org.big.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mchange.v1.cachedstore.CachedStore.Manager;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("managerService")
public class ManagerServiceImpl implements ManagerService{
	
	@Autowired
	private ManagerMapper managerMapper;

	
	@Transactional(readOnly=true)
	@Override
	public Manager managerlogin(String loginname, String password) {
		return managerMapper.findWithLoginnameAndPassword(loginname, password);
	}
	@Override
	public int addManager(Manager manager){
		return managerMapper.save(manager);
	}
	@Override
	public int updateManager(Manager manager){
		return managerMapper.update(manager);
	}
	
}
