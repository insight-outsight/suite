package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试Spring ApplicationContext上下文中Bean各初始化和销毁方法与注解的执行顺序
 * @author zcx
 *
 */
public class BeanInitializeOrderTest implements InitializingBean,DisposableBean{
	
    public BeanInitializeOrderTest(){
        System.out.println("执行 构造方法");
    }
    
    @PostConstruct
    public void postConstruct() {  
       System.out.println("执行postConstruct");  
    }  
    
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet"); 
    }
    
    public void initMethod() {
        System.out.println("执行init-method");
    }

    @PreDestroy
    public void preDestroy()  {
        System.out.println("执行preDestroy");
    }
    
    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy");
    }
    
    public void destroyMethod() {
        System.out.println("执行destroy-method");
    }
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.close();
    }
    
}

