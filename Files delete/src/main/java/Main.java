import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 项目名:  Files delete
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 22:42
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {
			File path = new File("./src/main/resources");
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				System.out.println(files[i].getName());
			}
			for (int i = 0; i < files.length; i++) {// 将resources里面的文件全部删除
				Files.delete(Paths.get(files[i].getPath()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
