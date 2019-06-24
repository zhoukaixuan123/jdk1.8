import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/23$
 * @description Stream流操作$
 */
public class Test24
{

    public static void main(String[] args) {
        //可以通过Collection  系列集合提供的Stream（串行流）
       //  或者ParallelStream  （并行流）
        List<Person> objects = Arrays.asList(
                new Person("张三",18,9000),
                new Person("李四",45,5000),
                new Person("王五",36,1000),
                new Person("赵六",50,10000),
                new Person("田七",60,200000)
        );

        //获取流
        Stream<Person> stream = objects.stream();

        //第二种方法获取流
        Person[] people = new Person[10];
        Stream<Person> stream1 = Arrays.stream(people);

        //第3中方法获取流
        Stream<String> a = Stream.of("a", "b", "c");

        //第四种  创建无限流
        //迭代
        System.out.println("第四种");
        Stream<Integer> iterate = Stream.iterate(0, (x) -> x + 2);
        iterate.limit(10) .forEach(System.out::println);

        //生成
        System.out.println("生成操作");
        Stream<Double> generate = Stream.generate(() -> Math.random());
        generate.forEach(System.out::println);

    }

}
