import java.lang.reflect.Method;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/7/1$
 * @description $
 */
class Test57 extends Teacher{

    public String getName(){
        return  "111";
    }

    public static void main(String[] args) {
        Class<Test57> test57Class = Test57.class;
        System.out.println("返回访问修饰符"+test57Class.getModifiers());
        System.out.println("返回该类的超类"+test57Class.getSuperclass());
        Method[] declaredMethods = test57Class.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println("返会该类生命的方法"+declaredMethods[i]);
        }




    }


}
