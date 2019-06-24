import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/20$
 * @description Lamda$
 */
public class Test18{


    public static void main(String[] args) {
        getShortList();
        System.out.println( "intaceface用法比较："+getBoolen(new String()));
    }

    public static List<Person> getShortList( ){

        List<Person> list = Arrays.asList(
                new Person("张三",18,9000),
                new Person("李四",45,5000),
                new Person("王五",36,1000),
                new Person("赵六",50,10000),
                new Person("田七",60,200000)
        );

        Collections.sort(list,(x,y) ->{
            if(x.getAge().equals( y.getAge())){
                return  x.getName().compareTo(y.getName());
            }else {
                return Integer.compare(x.getAge(),y.getAge());
            }
        });

        list.forEach((a) -> System.out.println(a));
     return  list;

    }

    public  static boolean getBoolen(Object o){
        if(o instanceof  Person){
            return  true;
        }
        return false;
    }
}

class  Test19{


    public static void main(String[] args) {

        System.out.println(getNUM(100L,200L,(x,y) -> x+y));

    }


    public static Long getNUM(Long t1,Long t2,MyFun<Long,Long> myFun){
        return  myFun.getResult(t1,t2);

    }


        }

   interface  MyFun<T,R>{
     R getResult(T t1,T t2);
   }