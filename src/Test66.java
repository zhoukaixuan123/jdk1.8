import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/1$
 * @description 数组
 */
public class Test66 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i);
        }
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        newList.addAll(list);
        System.out.println(list.toString());
    }
}
