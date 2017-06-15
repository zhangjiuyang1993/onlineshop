package com.bjtu.shop.adminuser.service;

import org.springframework.transaction.annotation.Transactional;

import com.bjtu.shop.adminuser.dao.AdminUserDao;
import com.bjtu.shop.adminuser.vo.AdminUser;
@Transactional
public class AdminUserService {
	// 注入Dao
	private AdminUserDao adminUserDao;

	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	
	public AdminUser login(AdminUser adminUser) {
		return adminUserDao.login(adminUser);
	}
	
}
