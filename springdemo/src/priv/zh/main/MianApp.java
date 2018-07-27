package priv.zh.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.zh.bean.Person;

public class MianApp {
	public static void main(String[] args) {
		BeanFactory bf=new ClassPathXmlApplicationContext("Beans.xml");
		Person person=(Person)bf.getBean("person");
		System.out.println(person);
		//hello
	}
}
