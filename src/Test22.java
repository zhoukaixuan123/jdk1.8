import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/23$
 * @description 构造器应用$
 */
public class Test22 {
    public static void main(String[] args) {
       //没有参数调用无参构造器
        Supplier<Person> supplier = Person::new;
        Person person = supplier.get();
        System.out.println(person);
        System.out.println("----------------");
        // 一个参数调用一个参数的构造器

        Function<Integer ,Person> a = Person::new;
        Person apply = a.apply(10010);
        System.out.println(apply.toString());
        //二个参数调用两个参数的构造器
        BiFunction<String,Integer,Person> pa = Person::new;
        Person apply1 = pa.apply("周凯旋", 1009);
        System.out.println(apply1.toString());


    }
}
