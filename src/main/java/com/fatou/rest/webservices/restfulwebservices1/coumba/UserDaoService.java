package com.fatou.rest.webservices.restfulwebservices1.coumba;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	private static List<User> users = new ArrayList<>();
	
	private static int usersCount = 3;
	
	static {
		users.add(new User(1, "Bintou", new Date()));
		users.add(new User(2, "Bintou", new Date()));
		users.add(new User(3, "Bintou", new Date()));
	}
	
	public List<User> findAll(){
		return users;
		
	}
	
	public User saveUser(User user) {
		if(user.getId()== 0) {
			user.setId(++usersCount);
		}
		
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for(User user:users) {
			if(user.getId()==id) {
				return user;
				}
		}
		return null;
	}
	
	
	
	
	
	

}

