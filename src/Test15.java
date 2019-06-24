import java.util.Comparator;
import java.util.TreeSet;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/19$
 * @description Java8$
 */
public class Test15 {

    public static void main(String[] args) {
        //匿名内部类
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> treeSet= new TreeSet<>(comparator);

        //1.8

        Comparator<Integer> com = (x,y)->Integer.compare(x,y);
        TreeSet<Integer> tree = new TreeSet<>(com );



    }
}
