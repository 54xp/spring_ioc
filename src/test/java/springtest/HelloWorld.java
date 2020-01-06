package springtest;

import com.bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xp
 * @create 2020-01-06 9:09
 */

public class HelloWorld {
    @Test
    public void helloWorld(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) ac.getBean("user");
        System.out.println("user = " + user);
        user.sayHello();
    }
}
