import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * 项目名:  RandomAccessFile
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 19:45
 * 描述:
 */
public class Main {

	private static final Logger logger = Logger.getLogger("Main.java");

	public static void main(String[] args) {

		try {
			File file = new File("./src/main/resources/test.txt");
			if (!file.exists()) {
				logger.info("file not exists");
				if (file.createNewFile()) {
					logger.info("create file");
				} else {
					logger.warning("create file failure");
				}
			}

			// 123456789

			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
			randomAccessFile.seek(randomAccessFile.length());// 定位到文件尾部
			String str = "||";
			randomAccessFile.writeBytes(str);// 添加信息
			// 123456789||

			randomAccessFile.seek(0);// 文件头
			randomAccessFile.writeBytes(str);// 以覆盖方式写入数据
			// ||3456789||
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
