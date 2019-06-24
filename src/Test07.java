import java.io.UnsupportedEncodingException;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/12$
 * @description $
 *
 *   字符串转码
 */
public class Test07 {
    public static void main(String[] args) throws UnsupportedEncodingException {

       String str2 =  new String("hello".getBytes("GB2312"),1,2);
        System.out.println(str2);
       String str3 = new String(new StringBuffer("My java is Vary good"));
        System.out.println(str3);
    }
}
