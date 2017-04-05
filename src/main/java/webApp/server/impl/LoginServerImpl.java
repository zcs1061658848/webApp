package webApp.server.impl;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import webApp.Pojo.User;
import webApp.dao.UserDao;
import webApp.server.LoginServer;

@Service("loginServerImpl")
public class LoginServerImpl implements LoginServer{
	
	@Resource
	UserDao userDao;

	public Collection<User> getAllUser() {
		return userDao.getAllUser();
	}
	

}
