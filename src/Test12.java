import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/6/18$
 * @description Socket 通讯$
 */
public class Test12 {

    public static void main(String[] args) throws IOException {
        InputStream in = null;
        OutputStream out = null;

        //创建ServerSocket对象，绑定监听端口
        ServerSocket ss = new ServerSocket(8011);

        while (true){
        try{

            //接受来自客户端的请求
            Socket     socket = ss.accept();
                System.out.println("连接服务器成功....");

            //得到来自客户端写入的数据
            in = socket.getInputStream();
            //服务器端输出流对象
            out = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(out);
            DataInputStream dis = new DataInputStream(in);
            //定义从客户端读出的字符串
            String s =null;
            //如果读出的不为空的话。向客户端发出本机的ip地址和连接的端口号
            if((s = dis.readUTF()) != null){
                System.out.println(s);
            }
            //向客户端写入
            dos.writeUTF(s);
            dis.close();//关闭流对象
            dos.close();
            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        }
    }
}

class Clinet{

    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        while (true){
        try{
            //创建Socket对象，指明需要连接的服务器的地址和端口号
            Socket socket = new Socket("localhost", 8011);
            is = socket.getInputStream();
            os = socket.getOutputStream();
            DataInputStream dis = new DataInputStream(is);
            DataOutputStream dos = new DataOutputStream(os);
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入您要输入的内容！");
            String s1 = scanner.nextLine();

            //连接建立后，通过输出流向服务器端发送请求信息
            dos.writeUTF(s1);
            String s = null;
            if((s = dis.readUTF()) != null){
                //通过输入流获取服务器响应的信息
                System.out.println(s);
            }
            dos.close();
            dis.close();
            socket.close();
        } catch (UnknownHostException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        }
    }

}