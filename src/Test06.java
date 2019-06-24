/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/12$
 * @description $   字符转反转和替换
 */
public class Test06 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("word");

        System.out.println(a.reverse());
        System.out.println( reverse("Hello"));
    }
    public static String reverse(String originStr) {
        if(originStr == null || originStr.length() <= 1)
            return originStr;
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
