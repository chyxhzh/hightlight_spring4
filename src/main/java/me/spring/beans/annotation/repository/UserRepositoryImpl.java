package me.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @author ���λ�
 * @date 2018-12-19 ����2:59:24
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepositoryImpl'save");
	}

}
