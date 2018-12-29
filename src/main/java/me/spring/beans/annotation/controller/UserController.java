package me.spring.beans.annotation.controller;

import me.spring.beans.annotation.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-19 ����3:06:22
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	public void execute(){
		System.out.println("UserController's execute methos");
		userService.add();
	}
}
