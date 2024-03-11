package org.springframework.beans.factory.support;

import org.springframework.beans.BeanException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    @Override
    public Object getBean(String name) throws BeanException {
        Object bean = getSingleton(name);
        if (bean == null) {
            BeanDefinition beanDefinition = getBeanDefinition(name);
            bean = createBean(name,beanDefinition);
        }
        return bean;
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeanException;

}
