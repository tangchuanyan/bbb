package cn.itcast.aop;

import org.springframework.stereotype.Controller;

@Controller
public class Book {

	public void add() {  //目的：增强Ｂｏｏｋ类里的ａｄｄ方法　，要增强的方法即为切入点
		System.out.println("类book的方法...........");
	}
}
