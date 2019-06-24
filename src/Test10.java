import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/13$
 * @description FileChanaer  直接读取分拣$
 */
public class Test10 {

    public String getString(){
        return  "周凯旋";
    }

    public static void main(String[] args) {
        try {
            RandomAccessFile fileInputStream = new RandomAccessFile("F:\\upload\\1.txt","rw");
            RandomAccessFile fileInputStream2 = new RandomAccessFile("F:\\upload\\2.txt","rw");

            FileChannel channel = fileInputStream.getChannel();
            FileChannel channel1 = fileInputStream2.getChannel();

            ByteBuffer allocate = ByteBuffer.allocate(1024);
            int read = channel.read(allocate);
            System.out.println(read);
//            while(channel.read(allocate) != -1){
//                allocate.flip();
//                channel1.write(allocate);
//                System.out.println(allocate);
//            }
            fileInputStream.close();
            channel.close();
            allocate.clear();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
