import com.demo.dao.UserDao;
import com.demo.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class MyBatisTest {
    private InputStream inputStream;
    private SqlSession session;
    private UserDao userDao;

    @Before
    public void init() throws IOException {
        // 1. 读取配置文件
        inputStream = Resources.getResourceAsStream("myBatis.xml");
        // 2. 创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(inputStream);
        // 3. 使用工厂生产SqlSession对象
        session = factory.openSession();
        // 4. 使用SqlSession创建Dao接口的代理对象
        userDao = session.getMapper(UserDao.class);
    }

    @After
    public void destroy() throws IOException {
        // 提交事务
        session.commit();
        // 6. 释放资源
        session.close();
        inputStream.close();
    }

    @Test
    public void testFindAllUser() {
        // 5. 使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSaveUser() {
        User userToSave = new User();
        userToSave.setUsername("wyf");
        userToSave.setAddress("Nanjing Road");
        userToSave.setBirthday(new Date());
        userToSave.setSex("f");
        System.out.println("before:" + userToSave);
        // 保存
        userDao.saveUser(userToSave);
        System.out.println("after:" + userToSave);
    }

    @Test
    public void testUpdateUser() {
        User userToSave = new User();
        userToSave.setId(54);
        userToSave.setUsername("wyf");
        userToSave.setAddress("Beijing Road");
        userToSave.setBirthday(new Date());
        userToSave.setSex("f");
        // 保存
        userDao.updateUser(userToSave);
    }

    @Test
    public void testDeleteUser() {
        userDao.deleteUser(54);
    }

    @Test
    public void testFindById() {
        // 5. 使用代理对象执行方法
        User user = userDao.findById(48);
        System.out.println(user);
    }

    @Test
    public void testFindByName() {
        // 5. 使用代理对象执行方法
        List<User> users = userDao.findByName("小");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetCount() {
        // 5. 使用代理对象执行方法
        int count = userDao.getCount();
        System.out.println("count: " + count);
    }
}
