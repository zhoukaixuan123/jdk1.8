import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/19$
 * @description lamda$
 */
public class Test16 {

    List<Person> objects = Arrays.asList(
            new Person("张三",18,9000),
            new Person("李四",45,5000),
            new Person("王五",36,1000),
            new Person("赵六",50,10000),
            new Person("田七",60,200000)
    );

    public static void main(String[] args) {


//        List<Person> collect = objects.stream().filter(a -> a.getAge() > 50).collect(Collectors.toList());
//        collect.forEach(System.out::println);
//        System.out.println("________-----------------------------------------");
//        Map<String,Integer> collect1 = objects.stream().collect(Collectors.toMap(Person::getName,Person::getAge));
//        collect1.forEach((s, integer) -> System.out.println(s+":"+integer));

    }
}

class  Test17{


    public  static  List<Person> getListPerson(List<Person> list,MyFunction<Person> myFunction){
        List<Person> people = new ArrayList<>();
        for (Person person : list) {
            if(myFunction.convert(person)){
                      people.add(person);
            }
        }
        return  people;

    }

    public static void main(String[] args) {
        List<Person> objects = Arrays.asList(
                new Person("张三",18,9000),
                new Person("李四",45,5000),
                new Person("王五",36,1000),
                new Person("赵六",50,10000),
                new Person("田七",60,200000)
        );
        List<Person> listPerson = getListPerson(objects, new MyFunctionClass());
        listPerson.forEach(System.out::println);

        System.out.println("--------------------------------");
        List<Person> listPerson2 = getListPerson(objects, new MyFunctionClass2());
        listPerson2.forEach(System.out::println);
    }
}
