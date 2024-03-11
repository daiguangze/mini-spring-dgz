# mini-spring-dgz
mini spring 


# IOC


## 最简单的bean容器
```java
public class BeanFactory {
	private Map<String, Object> beanMap = new HashMap<>();

	public void registerBean(String name, Object bean) {
		beanMap.put(name, bean);
	}

	public Object getBean(String name) {
		return beanMap.get(name);
	}
}
```

## BeanDefinition 和 BeanDefinitionRegistry
主要增加以下类
- BeanDefinition, 用于定义bean信息的类,包含bean的 class类型,构造参数,属性值等信息,每个bean对应一个BeanDefinition的实例. 简化BeanDefinition仅包含bean的class类型
- BeanDefinitionRegistry, BeanDefinition注册表接口, 定义注册BeanDefinition的方法
- SingletonBeanRegistry 及其实现类DefaultSingletonBeanRegistry, 定义添加和获取单例bean的方法

bean容器作为BeanDefinitionRegistry和SingletonBeanRegistry的实现类，具备两者的能力。向bean容器中注册BeanDefinition后，使用bean时才会实例化。


