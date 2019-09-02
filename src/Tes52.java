/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/30$
 * @description 设计模式$
 *
 *
 * 单例模式
 */


public class Tes52 {

    public static void main(String[] args) {
        //饿汉式
        String teacherName = SimpleClass.getTeacher().getTeacherName();
        System.out.println(teacherName);
        System.out.println("-----------------------------");
        //懒汉是
        System.out.println(  new SimpleClazz().getTeacherOne().getTeacherName());

    }
}

/**
 * 饿汉式
 */
class  SimpleClass{

    /**
     * 保证内存可见性
     */
  private  static volatile   Teacher teacher = new Teacher();


    public static   Teacher getTeacher(){
        return  teacher;
    }

}

class SimpleClazz{

    /**
     * 保证内存可见性
     */
    private  static volatile   Teacher teacher = null;

    public SimpleClazz(){
        if(teacher == null){
            teacher = new Teacher();
        }

    }

    public Teacher getTeacherOne(){
        return  teacher;
    }

}