import java.util.ArrayList;
import java.util.Arrays;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/30$
 * @description 汽车实体类$
 */
public class Teacher implements Study {

    public String getTeacherName(){
        return  "周凯旋";
    }

    @Override
    public Teacher getTeacher() {
        return new Teacher();
    }
}
