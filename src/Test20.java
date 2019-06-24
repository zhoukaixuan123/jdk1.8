import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/20$
 * @description $
 */
public class Test20 {

    /**
     *    java 8  4大内置核心函数接口
     *    Constumer<T> 消费型接口
     *       void accept(T t);
     *    Supplier<T>供给型接口
     *      T  get();
     *    Function<T,R> :函数型接口
     *       R  apply（T,t）;
     *    Predicate<T>：断言型接口
     *      boolean test(T t)
     *
     * @param args
     */
    public static void main(String[] args) {
        //消费接口
       constum(100,a -> System.out.println("消费"+a));
      //供给型接口
        getSuppler(5,()->  (int)(Math.random()*100));

    }

    public static void constum(int a, Consumer<Integer> b){

         b.accept(a);
    }

    public static  Integer getSuppler(Integer integer,Supplier<Integer> i){
        List<Integer> list = new ArrayList<>();
        for (Integer i1 = 0; i1 < integer; i1++) {
            list.add(i.get());
        }
        list.forEach(a -> System.out.println(a));
        return  123;
    }
}
