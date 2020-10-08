import com.demo.config.AppConfig;
import com.demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.printf("user: "+user);
    }
}
