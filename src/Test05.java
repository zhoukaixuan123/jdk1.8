/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/12$
 * @description $
 */
class A {

    static {
        System.out.print("1");
    }

    public A() {
        System.out.print("2");
    }
}

class B extends A{

    static {
        System.out.print("a");
    }

    public B() {
        System.out.print("b");
    }
}

public class Test05 {

    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }

}