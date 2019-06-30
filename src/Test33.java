import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/26$
 * @description 并行流和顺行流$
 */
public class Test33  extends RecursiveTask<Long> {

    private  long start;
    private  long end ;
    private static  final  long THRESHOL = 10000;

    public Test33(long start, long end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        long length = end - start;
        if(length<= THRESHOL){
            long sum = 0 ;
            for (long i = start; i <= end ; i++) {
                sum += i;
            }
              return sum;
        }else {
            long middle = (start+end)/2;
            Test33 left = new Test33(start,middle);
             left.fork();//拆分任务
            Test33 right = new Test33(middle+1,end);
            right.fork();//拆分任务
            return left.join()+right.join();
        }

    }


}

class Test34 {
    public static void main(String[] args) {
        Instant start = Instant.now();

        ForkJoinPool pool = new ForkJoinPool();
        Test33 task = new Test33(0, 100000000000L);
        Long sum = pool.invoke(task);
        System.out.println(sum);

        Instant end = Instant.now();
        System.out.println("耗费时间"+Duration.between(start,end).toMillis());



    }
}

class  Test35{
    public static void main(String[] args) {
        Instant s = Instant.now();
        long  sum = 0L;
        for (long i = 0; i <100000000000L ; i++) {
            sum += i ;
        }
        Instant end = Instant.now();
        System.out.println("耗费时间"+Duration.between(s,end).toMillis());

    }
}

/**
 *
 * 并行流
 *
 */
class  Test36{

    public static void main(String[] args) {

        Instant s = Instant.now();


        //并行流
//        LongStream.rangeClosed(0,100000000000L)
//                .reduce(0,Long::sum);


        LongStream.rangeClosed(0,100000000000L)
                .parallel()
               .reduce(0,Long::sum);
        Instant end = Instant.now();
        System.out.println("耗费时间"+Duration.between(s,end).toMillis());


    }

}
