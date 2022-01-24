import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 项目名:  Files newDirectoryStream
 * 开发者:  Administrator
 * 创建于:  2022 一月 23 星期日 23:20
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {

			File file = new File("./src/main/resources");
			DirectoryStream<Path> directoryStream = Files.newDirectoryStream(file.toPath());
			for (Path v : directoryStream) {
				System.out.println(v.toFile());
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
