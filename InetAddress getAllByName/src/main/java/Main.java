import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 项目名:  InetAddress getAllByName
 * 开发者:  Administrator
 * 创建于:  2022 一月 27 星期四 15:21
 * 描述:
 */
public class Main {

	public static void main(String[] args) throws UnknownHostException, IOException {// enter args ==> host

		File file = new File("./src/main/resources/out.txt");
		if (!file.exists()) {
			file.createNewFile();
		}

		if (args.length > 0) {

			String host = args[0];// 获取主机
			InetAddress[] addresses = InetAddress.getAllByName(host);// 获取网络地址

			// 打印输出
			for (InetAddress inetAddress : addresses) {

				System.out.println(inetAddress);
			}
		} else {

			InetAddress localAddress = InetAddress.getLocalHost();// 为本地主机创建一个InetAddress对象
			System.out.println(localAddress);// 打印输出
		}
	}
}
