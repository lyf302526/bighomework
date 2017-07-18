package org.big.service;

import com.mchange.v1.cachedstore.CachedStore.Manager;

public interface ManagerService {
	Manager managerlogin(String loginname,String password);
	int addManager(Manager manager);
	int updateManager(Manager manager);

}
