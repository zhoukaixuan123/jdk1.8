import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/23$
 * @description 类型转换$
 */
public class Test26 {
    public static void main(String[] args) {
        List<Person> objects = Arrays.asList(
                new Person("张三",18,9000),
                new Person("李四",45,5000),
                new Person("王五",36,1000),
                new Person("赵六",50,1000),
                new Person("赵六",50,1000)
        );
        List<String> list = Arrays.asList("aaaa","nbbbb","cccc");
        list.stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("------------------------");
        objects.stream().map(Person::getName)
                .forEach(System.out::println);
        System.out.println("--------------map----------");
        list.stream().map(Test26::fifterCaracter)
                .forEach(a ->{
                    a.forEach(System.out::println);
                });

        System.out.println("--------------flatMap----------");
        list.stream().flatMap(Test26::fifterCaracter)
                .forEach(System.out::println);
        System.out.println("--------------add  addAll测试----------");

        List<Object> strings = new ArrayList<>();
        strings.add(list);
        strings.addAll(list);
        System.out.println(strings.toString());

    }


    public static Stream<Character> fifterCaracter(String str){
        List<Character> characters = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            characters.add(character);
        }
        return  characters.stream();
    }
}

