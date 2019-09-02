/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/7/14$
 * @description 代理
 */
interface  Test61 {

    String showName();
}

/**
 *  实现类
 */
class  Demo implements  Test61{

    @Override
    public String showName() {
        return "你愁啥";
    }
}
class  Demo1 implements  Test61{

    @Override
    public String showName() {
        return "My name is zhansan";
    }
}

/**
 * 代理类
 */
class  ProxyDemo {
    public  Object demo =null;

    public ProxyDemo (){

    }
    public Demo ProxyDemo(Demo demp){
        return demp;
    }
    public Demo1 ProxyDemo(Demo1 demp1){
        return demp1;
    }
}

class classMain{
    public static void main(String[] args) {
        ProxyDemo demo1 = new ProxyDemo();
        String s = demo1.ProxyDemo(new Demo()).showName();
        System.out.println(s);
        String s1 = demo1.ProxyDemo(new Demo1()).showName();
        System.out.println(s1);



    }
}