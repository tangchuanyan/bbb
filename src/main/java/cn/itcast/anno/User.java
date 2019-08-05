package cn.itcast.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="user")  //创建类User的对象user // <bean id="user" class=""/>
@Scope(value="prototype") //指定创建的对象为多实例，单实例为singletype
public class User {

	public void add() {
		System.out.println("类User的方法...........");
	}
}
