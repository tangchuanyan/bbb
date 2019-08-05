package cn.itcast.aop;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAnno {
	
	@Test
	public void testService() {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean3.xml");
		Book book = (Book) context.getBean("book");
		book.add();
	}
}
