import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/24$
 * @description 数字列表如何返回一个由每个数的平方构成的列表$
 */
public class Test30 {

    public static void main(String[] args) {
        Integer [] nums = new Integer[]{1,2,3,4,5};
         Arrays.stream(nums).map((x) -> x * x).forEach(System.out::println);
       //
       // Arrays.stream(nums).reduce(0,(x)->x*x)
    }
}
