import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/28$
 * @description 时间格式化$
 */
public class Test50 {
    /**
     * 时间格式转化
     * @param args
     */
    public static void main(String[] args) {
        DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_DATE;
        System.out.println(isoLocalDateTime);
        LocalDateTime now = LocalDateTime.now();
        String format = now.format(isoLocalDateTime);
        System.out.println(format);

        System.out.println("----------------指定格式---------------");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String a1 = now.format(time);
        System.out.println(a1);

        System.out.println("+++++++++++++++时区格式化API++++++++++++");
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//时区
        availableZoneIds.forEach(System.out::println);

        System.out.println("++++++指定时区++++++++++++++++++");
        LocalDateTime now1 = LocalDateTime.now(ZoneId.of("Asia/Tbilisi"));
        System.out.println(now1);



    }
}
