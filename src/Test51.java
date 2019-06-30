import java.lang.annotation.*;
import java.lang.reflect.Method;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/28$
 * @description 重复直接与类型注解$
 */
public class Test51 {

    @MyAnnotation("word")
    @MyAnnotation("hello")
    public  void show(@MyAnnotation("abc") String str){

    }

    /**
     * 没看懂的注解 反射
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Class<Test51> test51Class = Test51.class;
        Method show = test51Class.getMethod("show");
        MyAnnotation[] ms = show.getAnnotationsByType(MyAnnotation.class);

        for (MyAnnotation m : ms) {
            System.out.println(m.value());
        }


    }
}

@Repeatable(MyAnnotations.class)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotation{
    String value()default "周凯旋";
}

@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnnotations{

    MyAnnotation[] value();
}