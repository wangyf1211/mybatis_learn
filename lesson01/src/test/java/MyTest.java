import com.demo.wyf.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args){
//        用户实际调用业务层
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        // 获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //
        UserService userService = (UserService) context.getBean("userService");
        userService.getUser();
    }
}
