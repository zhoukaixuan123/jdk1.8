import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/23$
 * @description StreamAPI$
 */
public class Test25 {

    public static void main(String[] args) {
      List<Person> objects = Arrays.asList(
              new Person("张三",18,9000),
              new Person("李四",45,5000),
              new Person("王五",36,1000),
              new Person("赵六",50,1000),
              new Person("赵六",50,1000)
      );


      //中间操作  不会执行任何操作
        //终止操作会一次性执行全部  即惰性求值
        objects.stream()
                //过滤操作
                .filter(a -> a.getAge()>35)
                //条数操作
                //.limit(2)
                //跳过前2条
                //.skip(2)
                //去重
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
