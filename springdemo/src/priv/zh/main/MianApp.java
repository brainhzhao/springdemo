package priv.zh.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import priv.zh.bean.Person;

public class MianApp {
	public static void main(String[] args) {
		//commit to local repository
		BeanFactory bf=new ClassPathXmlApplicationContext("Beans.xml");
		Person person=(Person)bf.getBean("person");
		System.out.println(person);
		//this is add by github
		//hello
	}
}
