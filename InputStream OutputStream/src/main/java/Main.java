import java.io.InputStream;
import java.io.OutputStream;

/**
 * 项目名:  InputStream OutputStream
 * 开发者:  Administrator
 * 创建于:  2022 一月 17 星期一 16:21
 * 描述:
 */
public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        while (inputStream.available() >= 0) {
            int tmp = inputStream.read();
            if (tmp == 'q') {
                break;
            }
            outputStream.write(tmp);
        }
        inputStream.close();
        outputStream.close();
    }
}
