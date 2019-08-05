package cn.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {

	public void before1() {
		System.out.println("前置增强......");
	}
//	如果成功，在Book类的方法前输出
	
	public void after1() {
		System.out.println("后置增强......");
	}

	//环绕通知
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		//方法之前
		System.out.println("方法之前.....");

		//执行被增强的方法(Book.add())
		proceedingJoinPoint.proceed();

		//方法之后
		System.out.println("方法之后.....");
	}
}
