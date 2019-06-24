/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/12$
 * @description 断言演示$
 */
public class Test09 {
    public static void main(String[] args) {
        boolean isOk = 1 > 2;
        try {
            assert  isOk;
            
            assert isOk : "程序错误";
            System.out.println("程序正常");
        } catch (AssertionError err) {
            System.out.println(err.getMessage());
        }
    }
}
