import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/12$
 * @description 获取时间函数$
 */
public class Test08 {


    public static void main(String[] args) {
        Calendar time = Calendar.getInstance();
        System.out.println("time:"+time);

        System.out.println("当前时间："+ time.getTime());
        //获取毫秒数
        System.out.println("获取毫秒数"+    Calendar.getInstance().getTimeInMillis());

        LocalDate now = LocalDate.now();
        System.out.println("1.8时间特性："+ now);
        System.out.println("1.8获取毫秒数："+ Clock.systemDefaultZone().millis());

    }
}
