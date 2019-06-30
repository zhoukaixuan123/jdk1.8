import java.util.Optional;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/26$
 * @description Optional 空指针类
 *
 *   常用方法
 *   Optional.of  创建一个Optioal 实例
 *  Optional.ofNullable(T value)返回一个 Optional指定值的Optional，如果非空，则返回一个空的 Optional 。
 *
 * $
 */
public class Test39 {
    public static void main(String[] args) {
        Optional<Person> op = Optional.of(new Person());
        Person person = op.get();
        System.out.println(person);
        System.out.println("--------------");
        Optional<Person> empty = Optional.ofNullable(new Person());
        if(empty.isPresent()){
            System.out.println(empty.get());
        }
        System.out.println("--------------orElse---------------");
        Person o = empty.orElse(new Person(1));
        System.out.println(o);
        System.out.println("-------empty-----------");
//        Optional<Person> emp = Optional.empty();
//        System.out.println(emp.get());


    }

    public static  void getOptial(){
        Optional<Person> person = Optional.ofNullable(new Person("站三", 100, 9000.0));

    }
}
