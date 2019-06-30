
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/27$
 * @description 时间API$
 */
public class Test42  {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Date> dateCallable = new Callable<Date>(){
            @Override
            public Date call() throws Exception {
                return DateFormatLL.convert("20161218");
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        List<Future<Date>> result = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            result.add(threadPool.submit(dateCallable));
        }

        for (Future<Date> dateFuture : result) {
            System.out.println(dateFuture.get());
        }
        threadPool.shutdown();
    }
}
class DateFormatLL{

    private static  final  ThreadLocal<DateFormat>  df = new ThreadLocal<DateFormat>(){
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyyMMdd");
        }

    };

    public static  Date convert(String source) throws ParseException {
        return df.get().parse(source);
    }


}

/**
 * 1.8 新的日期API
 */
class Test43{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        DateTimeFormatter yyyyMMdd = DateTimeFormatter.ofPattern("yyyyMMdd");
        Callable<LocalDate> dateCallable = new Callable<LocalDate>(){
            @Override
            public LocalDate call() throws Exception {
                return LocalDate.parse("20161218",yyyyMMdd);
            }
        };

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        List<Future<LocalDate>> result = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            result.add(threadPool.submit(dateCallable));
        }

        for (Future<LocalDate> dateFuture : result) {
            System.out.println(dateFuture.get());
        }
        threadPool.shutdown();
    
    }
}