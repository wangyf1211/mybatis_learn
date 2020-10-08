import com.exercise.service.CalculateService;
import com.exercise.service.CalculateServiceImpl;
import com.proxy.dynamictype.MyHandler;

public class TestCal {
    public static void main(String[] args) {
        CalculateService calculateService = new CalculateServiceImpl();
        MyHandler handler = new MyHandler(calculateService);
        CalculateService proxy = (CalculateService) handler.getProxy();
        int price = proxy.printSalary("wyf");
        System.out.println("price: " + price);
    }
}
