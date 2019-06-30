/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/27$
 * @description 接口默认方法 和静态方法$
 */
public interface Test40 {

    default String getName(){
        return "哈哈哈";
    }
}
 interface Test41{

    default String getName(){
        return "呵呵";
    }

    public  static  String getString(){
        return "静态方法";
    }
}
class  Myclass implements Test40,Test41{
    @Override
    public String getName() {
        return Test41.super.getName();
    }

//    @Override
//    public String getName(){
//        return "实现类";
//    }
}
class MainClass{

    public static void main(String[] args) {
        Myclass myclass = new Myclass();
        System.out.println(myclass.getName());
        System.out.println(Test41.getString());

    }
}
