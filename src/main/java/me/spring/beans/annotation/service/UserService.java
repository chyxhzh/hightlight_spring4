package me.spring.beans.annotation.service;

import me.spring.beans.annotation.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-19 ����3:01:10
 */
@Service
public class UserService {
	
	@Autowired
	@Qualifier("userJdbcRepository")
	private UserRepository userRepository;
	
	public void add(){
		System.out.println("UserService's add method");
		userRepository.save();
	}
	
}
