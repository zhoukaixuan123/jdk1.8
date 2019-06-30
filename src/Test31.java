import java.util.Arrays;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/25$
 * @description $
 */
public class Test31 {

    public static void main(String[] args) {
        Integer [] arr = new Integer[]{3,2,1,6,5,4};
//        //1> 先进行排序按照  从小到大
//        Arrays.sort(arr);
//        //2> 循环比对（分别第一个  和 第二个比  第二个和第三个比）
//        for (int i = 0; i < arr.length; i++) {
//            // 2.1>  i+1   比对永远是第一个和  后面所有的比
//            for (int j = i+1; j < arr.length; j++) {
//                // 2.2>  num  中间值做记录
//                int num = 0;
//                // 2.3>  假设第一个永远小于第二个  测记录两个值中最小的那个
//                //      如果第一个小于第二个就进行记录  else进行下一次
//                if(arr[i] < arr[j]){
//                    // 2.4 >  记录小的那个
//                    num = arr[i];
//                    //2.5> 把大的值赋值 给 i 也就是当前的第一个
//                    arr[i] = arr[j];
//                    arr[j] = num;
//                }
//            }
//        }
//        for (int m = 0; m < arr.length; m++) {
//            System.out.println(arr[m]);
//        }


       //
        Arrays.stream(arr).sorted((a,b) -> -a.compareTo(b)).forEach(System.out::println);

    }
}
