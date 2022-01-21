import java.io.File;
import java.io.IOException;

/**
 * 项目名:  file createNewFile
 * 开发者:  Administrator
 * 创建于:  2022 一月 21 星期五 17:26
 * 描述:
 */
public class Main {

	public static void main(String[] args) throws IOException {
		File file = new File("./src/main/resources/newFile.txt");
		if (file.exists()) {
			System.out.println("file is exits");
		} else {
			System.out.println("create file");
			file.createNewFile();
		}
	}
}
