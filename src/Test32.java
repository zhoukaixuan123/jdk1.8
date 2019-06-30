import java.util.Arrays;
import java.util.List;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/25$
 * @description lamdba练习$
 */
public class Test32 {
    public static void main(String[] args) {
        Integer [] nums = new  Integer[]{1,2,3,4,5};
        Arrays.stream(nums).map((a) -> a*a).forEach(System.out::println);
        System.out.println("----------------------------------");

        List<Person> objects = Arrays.asList(
                new Person("张三2",24,9000, Person.Stauts.BUSY),
                new Person("张三1",62,9000, Person.Stauts.BUSY),
                new Person("张三",61,9000, Person.Stauts.BUSY),
                new Person("李四",45,5000,Person.Stauts.FREE),
                new Person("王五",36,1000,Person.Stauts.BUSY),
                new Person("赵六",50,1000,Person.Stauts.VOCATION),
                new Person("赵六",50,1000,Person.Stauts.FREE)
        );

        objects.stream().filter(a-> a.getAge()>45)
                .sorted((a,b) -> Double.compare(a.getSalary(),b.getSalary()))
                .map(Person::getName )
                .forEach(System.out::println);
    }

}
