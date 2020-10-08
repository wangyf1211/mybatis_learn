import com.demo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在Spring中管理
        Hello hello = (Hello) context.getBean("helloWa");
        System.out.println("hello: "+hello);

        Hello helloConstruct = context.getBean("helloConstructor", Hello.class);
        System.out.println("helloConstructor: "+helloConstruct);

    }
}
