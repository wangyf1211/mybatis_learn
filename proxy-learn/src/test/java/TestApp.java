import com.proxy.dynamictype.MyHandler;
import com.proxy.statictype.Sell;
import com.proxy.statictype.manufacturer.Apple;
import com.reflect.service.HelloService;
import com.reflect.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHello("wyf");

//        使用反射机制执行sayHello方法
        HelloService target = new HelloServiceImpl();
        Method sayHello = HelloService.class.getMethod("sayHello", String.class);
        /**
         * invoke是Method类中的方法，表示执行方法的调用
         * object表示执行方法的对象
         * Object... args，方法执行的参数
         */
        sayHello.invoke(target, "wyf reflect");
        Apple apple = new Apple();
        MyHandler handler = new MyHandler(apple);
//        Sell proxy = (Sell) handler.getProxy();
        Sell proxy= (Sell) Proxy.newProxyInstance(handler.getClass().getClassLoader(), apple.getClass().getInterfaces(), handler);
        proxy.sell(100);

    }
}
