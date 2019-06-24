import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/24$
 * @description 规约 reduce$
 */
public class Test29 {
    static List<Person> objects1 = Arrays.asList(
            new Person("张三2",60,9000, Person.Stauts.BUSY),
            new Person("张三1",60,9000, Person.Stauts.BUSY),
            new Person("张三",60,9000, Person.Stauts.BUSY),
            new Person("李四",45,5000,Person.Stauts.FREE),
            new Person("王五",36,1000,Person.Stauts.BUSY),
            new Person("赵六",50,1000,Person.Stauts.VOCATION),
            new Person("赵六",50,1000,Person.Stauts.FREE)
    );
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer reduce = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println(reduce);

        System.out.println("--------------------------");
        List<Person> objects = Arrays.asList(
                new Person("张三2",24,9000, Person.Stauts.BUSY),
                new Person("张三1",60,9000, Person.Stauts.BUSY),
                new Person("张三",60,9000, Person.Stauts.BUSY),
                new Person("李四",45,5000,Person.Stauts.FREE),
                new Person("王五",36,1000,Person.Stauts.BUSY),
                new Person("赵六",50,1000,Person.Stauts.VOCATION),
                new Person("赵六",50,1000,Person.Stauts.FREE)
        );
        Double reduce1 = objects.stream().map(Person::getSalary).reduce(0d, (x, y) -> x + y);
        System.out.println(reduce1);


        System.out.println("------------------收集-------------------");
        List<String> collect = objects.stream().map(Person::getName).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------特殊容器------------------");
        HashSet<String> collect1 = objects.stream().map(Person::getName).collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect1);
        System.out.println("--------------分组--------------");
        test();
        System.out.println("--------------------多级分组----------------");
        test1();
        System.out.println("--------------------分区----------------");
        test2();

    }

    /*分组*/
    public  static  void test(){
        Map<Person.Stauts, List<Person>> collect =
                objects1.stream()
                 .collect(Collectors.groupingBy(Person::getStauts));
        System.out.println(collect.toString());
    }
    //多级分组
    public  static  void test1(){
        Map<Person.Stauts, Map<Object, List<Person>>> collect =
         objects1.stream()
               .collect(Collectors.groupingBy(Person::getStauts,Collectors.groupingBy((e)-> {
                   if(((Person)e).getAge()<= 25){
                              return "青年";
                   }else  if(((Person)e).getAge()<= 50 && ((Person)e).getAge()> 25){
                       return  "中年";
                   }else {
                       return  "老年";
                   }
               })));
        System.out.println(collect.toString());
    }

    //分区
    public  static  void test2(){
        Map<Boolean, List<Person>> collect = objects1.stream().collect(Collectors.partitioningBy(e -> e.getSalary() > 800));
        System.out.println(collect);
    }
}
