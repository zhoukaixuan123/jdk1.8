import java.time.*;
import java.time.temporal.TemporalAdjusters;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/28$
 * @description 时间API$
 */
public class Test45 {

    public static void main(String[] args) {
        LocalDate localDate =LocalDate.now();
        System.out.println(localDate);

        System.out.println("------------------");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime of = LocalDateTime.of(2015, 12, 1, 22, 43);
        System.out.println("时间格式："+of);
        LocalDateTime localDateTime = of.plusYears(2);
        System.out.println("加时间："+localDateTime);
        LocalDateTime localDateTime1 = of.minusMonths(1);
        System.out.println("减一年："+localDateTime1);
        System.out.println("--------------------------");
        LocalTime now1 = LocalTime.now();
        System.out.println(now1);

        System.out.println("++++++++++++++++++++++++++++");



    }
}
class Test46{
    //时间戳

    /**
     * Instant  时间戳  已元年  1970.1.1到某个时间的毫秒值    我们称之为时间戳
     * @param args
     */
    public static void main(String[] args) {
        //默认以UTC时区获取的时间
        Instant now = Instant.now();
        System.out.println("时间错："+now);
        //偏移量计算
        OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
        System.out.println(atOffset);

        System.out.println("获取毫秒数"+now.toEpochMilli());

        System.out.println("改变时间"+Instant.ofEpochSecond(60));

    }
}
class Test47{
    /**
     * Duration   计算两个时间之间的间隔
     * Period   计算两个日期之间的间隔
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant end = Instant.now();
        Duration between = Duration.between(start, end);
        System.out.println(between.toMillis());

        System.out.println("获取时间");
        Instant start1 = Instant.now();
        Thread.sleep(1000);
        Instant end2 = Instant.now();


        System.out.println("获取毫秒数"+ Duration.between(start1,end2));

        System.out.println("++++++++++++++获取两个日期之间的间隔++++++++++++");

        LocalDate of = LocalDate.of(2015, 1, 1);
        LocalDate localDate = LocalDate.now();
        Period between1 = Period.between(of, localDate);
        System.out.println(between1);
        System.out.println("获取年"+between1.getYears());
        System.out.println("获取月"+between1.getMonths());
        System.out.println("获取日"+between1.getDays());



    }
}

/**
 *  时间矫正器
 */
class Test48{

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        //矫正日期
        LocalDateTime localDateTime = now.withDayOfMonth(10);
        System.out.println(localDateTime);

        LocalDateTime with = now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(with);

        System.out.println("==========自定义：下一个工作日=============");
        LocalDateTime with1 = now.with((l) -> {
            LocalDateTime ld = (LocalDateTime) l;
            DayOfWeek dayOfWeek = ld.getDayOfWeek();
            if (dayOfWeek.equals(DayOfWeek.FRIDAY)) {
                return ld.plusDays(3);
            } else {
                return ld.plusDays(1);
            }

        });
        System.out.println(with1);

    }
}