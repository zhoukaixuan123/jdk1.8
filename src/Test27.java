import java.util.Arrays;
import java.util.List;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/24$
 * @description 排序$
 */
public class Test27 {

    public static void main(String[] args) {
          List<String> list   = Arrays.asList("aaa","bbbb");
          list.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------");
        List<Person> objects = Arrays.asList(
                new Person("张三",60,9000),
                new Person("李四",45,5000),
                new Person("王五",36,1000),
                new Person("赵六",50,1000),
                new Person("赵六",50,1000)
        );
        objects.stream().sorted((a,b) -> {
            if(a.getAge().equals(b.getAge())){
                return  a.getName().compareTo(b.getName());
            }
            return  -a.getAge().compareTo(b.getAge());
        }).forEach(System.out::println);

    }
}
