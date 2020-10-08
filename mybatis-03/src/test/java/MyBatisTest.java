import com.demo.dao.UserDao;
import com.demo.dao.impl.UserDaoImpl;
import com.demo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    //    入门配置
    public static void main(String[] args) throws IOException {
        // 1. 读取配置文件
        InputStream input = Resources.getResourceAsStream("myBatis.xml");
        // 2. 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(input);
        // 3. 使用工厂创建Dao对象
        UserDao userDao = new UserDaoImpl(factory);
        // 4. 使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        // 5. 释放资源
        input.close();
    }

}
