import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/18$
 * @description 反射$
 */
public class Test14 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InstantiationException {

        //根据Class 反射
        Method m = new Dog().getClass().getMethod("getString");
        System.out.println(m.invoke(new Dog()));


        Method name = new Dog().getClass().getMethod("getName", String.class,String.class);
        System.out.println(name.invoke(new Dog(),"狗","18"));


        Class<?> dog = Class.forName("Dog");
        Object o = dog.newInstance();
        Method getName = dog.getMethod("getName", String.class, String.class);
        System.out.println(getName.invoke(dog.newInstance(),"猫","50"));

    }
}

class  Dog{

    public String getString (){
        return  "Dog";
    }

    public String getName(String name,String age){
        return  name+":"+age;
    }
}
