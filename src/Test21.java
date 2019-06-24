import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/23$
 * @description Lamdba 方法引用$
 */
public class Test21 {
    public static void main(String[] args) {

        //消费函数
        Consumer<String> consumer =System.out::println;
        consumer.accept("周凯旋");
        System.out.println("---------------------------");


        Person person= new Person();
        person.setName("张三");
        person.setAge(100);
        person.setSalary(10000);
        Supplier<String> supplier = ()-> person.getName();
        supplier.get();
        System.out.println(supplier.toString());

        System.out.println("---------------------------");
        Supplier<Integer> supplier1 = person::getAge;
        supplier1.get();
        System.out.println(supplier1.toString());

        System.out.println("----------------------");
        TestInf a = new TestMethod()::getString;
        System.out.println(a.getString("方法演示"));

    }

}

class TestMethod implements TestInf{

    @Override
    public  String  getString(String name){
        return  name;
    }

}

interface  TestInf{
    String  getString(String name);
}
