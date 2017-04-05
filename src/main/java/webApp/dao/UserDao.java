package webApp.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import webApp.Pojo.User;

public interface UserDao {
	
	Collection<User> getAllUser();

}
