package org.springframework.test.ioc;

import bean.Person;
import org.junit.Test;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;

public class PopulateBeanWithPropertyTest {

    @Test
    public void test(){
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("name", "derek"));
        propertyValues.addPropertyValue(new PropertyValue("age", 18));
        BeanDefinition beanDefinition = new BeanDefinition(Person.class, propertyValues);
        factory.registerBeanDefinition("person", beanDefinition);

        Person person = (Person) factory.getBean("person");
        System.out.println(person);

    }
}
