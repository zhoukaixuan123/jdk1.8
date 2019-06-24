import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/24$
 * @description 终止操作$
 */
public class Test28 {
    public static void main(String[] args) {
        List<Person> objects = Arrays.asList(
                new Person("张三2",60,9000, Person.Stauts.BUSY),
                new Person("张三1",60,9000, Person.Stauts.BUSY),
                new Person("张三",60,9000, Person.Stauts.BUSY),
                new Person("李四",45,5000,Person.Stauts.FREE),
                new Person("王五",36,1000,Person.Stauts.BUSY),
                new Person("赵六",50,1000,Person.Stauts.VOCATION),
                new Person("赵六",50,1000,Person.Stauts.FREE)
        );

        System.out.println("---------------allMactch  匹配所有的元素----------------");
        boolean b = objects.stream().allMatch(e -> e.getStauts().equals(Person.Stauts.BUSY));
        System.out.println(b);
        System.out.println("---------------至少有一个匹配----------------");
        boolean  c= objects.stream().anyMatch(e -> e.getStauts().equals(Person.Stauts.BUSY));
        System.out.println(c);
        System.out.println("---------------检查是否没有匹配所有的元素----------------");
        boolean  m= objects.stream().noneMatch(e -> e.getStauts().equals(Person.Stauts.BUSY));
        System.out.println(m);
        System.out.println("---------------返回第一个元素---------------");
        Optional<Person> first = objects.stream().sorted((a1, a2) -> Double.compare(a1.getSalary(), a2.getSalary())).findFirst();
        System.out.println(first);
        System.out.println("---------------返回任何一个回滚元素---------------");
        Optional<Person> any = objects.stream().filter(a -> a.getStauts().equals(Person.Stauts.BUSY)).findAny();
        System.out.println(any);
        System.out.println("---------------返回元素中的总数---------------");
        long count = objects.stream().count();
        System.out.println(count);
        System.out.println("---------------返回工资最高的---------------");
        Optional<Person> max = objects.stream().max((a, v) -> Double.compare(a.getSalary(), v.getSalary()));
        System.out.println(max.get());
        System.out.println("---------------返回工资少的---------------");
        Optional<Double> min = objects.stream().map(Person::getSalary).min(Double::compareTo);
        System.out.println(min.get());




    }
}
