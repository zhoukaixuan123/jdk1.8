/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/30$
 * @description i模式$
 */
public class Test54 {

    public static void main(String[] args) {

        PorxyClass aClass = new PorxyClass();

        System.out.println( aClass.getName());

    }

}


class  PorxyClass implements Study{

    private Study study;

    public  PorxyClass(){
        this.study = new Teacher();
    }


    @Override
    public Teacher getTeacher() {
        return null;
    }

    public String getName(){
        return  study.getTeacher().getTeacherName();
    }
}
