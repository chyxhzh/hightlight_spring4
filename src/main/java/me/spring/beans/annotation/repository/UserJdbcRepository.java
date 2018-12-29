package me.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @author ºîÖÎ»ª
 * @date 2018-12-19 ÏÂÎç2:54:01
 */
@Repository
public class UserJdbcRepository implements UserRepository {

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserJdbcRepository's save");
	}

}
