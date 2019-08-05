package cn.itcast.anno;

import org.springframework.stereotype.Component;

@Component(value="userDao") //创建类UserDao的对象userDao
public class UserDao {

	public void add() {
		System.out.println("类UserDao的方法.........");
	}
}
