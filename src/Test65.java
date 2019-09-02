import java.util.*;
import java.util.stream.Collectors;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/1$
 * @description 面试题测试
 */
public class Test65 {

    public static void main(String[] args) {
        /**
         * 第一题
         */
        String a = "hello";
        String b = "he"+new String("llo");
        System.out.println(a==b);
        System.out.println("-----------------------------");
        String c = new String ("hello");
        System.out.println(a==c);
        System.out.println("-----------------------------");
        String f = new String ("hello").intern();
        System.out.println(a == f );


    }
}
