import java.io.FileInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * 项目名:  PushbackInputStream
 * 开发者:  Administrator
 * 创建于:  2022 一月 17 星期一 21:56
 * 描述:
 */
public class Main {

    public static void main(String[] args) throws IOException {
        PushbackInputStream inputStream = new PushbackInputStream(new FileInputStream("test.txt"));
        int data = inputStream.read();
        inputStream.unread(data);
        System.out.println("data = " + data);// '1'的ascii码为49
        data = inputStream.read();
        System.out.println("data = " + data);
    }
}
