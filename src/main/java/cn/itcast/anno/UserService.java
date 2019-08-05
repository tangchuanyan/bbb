package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")   //创建类UserService的对象userservice
public class UserService {

	//得到dao对象
	//1 定义dao类型属性
	//在dao属性上面使用注解 完成对象注入
//	@Autowired
//	private UserDao userDao;
	// 使用注解方式时候不需要set方法
	// name属性值 写 注解创建dao对象 value值
	@Resource(name="userDao")   //注入另一个类UserDao的属性userDao
	private UserDao userDao;
	
	public void add() {
		System.out.println("在UserService类里调用另一个类UserDao的方法...........");
		userDao.add();
	}
}
