import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/30$
 * @description 工厂模式$
 */
public class Test53 {


    public static void main(String[] args) {
        Study teacher = new Teacher();
        String teacherName = ((Teacher) teacher).getTeacherName();
        System.out.println(teacherName);
        List list = new ArrayList();
        System.out.println(list.size()+"list群");

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 2, 3,
                TimeUnit.MILLISECONDS, new LinkedBlockingQueue< Runnable >(5) );
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("");
            }
        });


    }
}

interface  Study{

public Teacher getTeacher();
        }