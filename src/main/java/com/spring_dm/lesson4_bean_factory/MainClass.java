package com.spring_dm.lesson4_bean_factory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainClass {
    public static void main(String[] args) {
        FileSystemResource p = new FileSystemResource(
                "D:\\Study\\Java\\Projects\\Spring_dm\\src\\main\\resources\\lesson4_bean_factory\\configBeanFactory.xml");

        BeanFactory factory = new XmlBeanFactory(p);

        TestBeanFactory testBeanFactory = factory.getBean("testBeanFactory", TestBeanFactory.class);
        testBeanFactory.someThing();
    }
}
