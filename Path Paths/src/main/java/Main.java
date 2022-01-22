import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 项目名:  Path Paths
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 22:20
 * 描述:
 */
public class Main {

	public static void main(String[] args) throws IOException {

		try {

			Path filePath = Paths.get("./src/main/resources/out.txt");
			File file = new File(filePath.toString());
			if (!file.exists()) {

				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);

			Path path = Paths.get("C:/file/data/test.txt");// create path, use paths toolkits
			pw.println("file name: " + path.getFileName());// get name of the file or direction
			pw.println("parent path: " + path.getParent());// get absolute path of parent of the file
			for (int i = 0; i < path.getNameCount(); i++) {// get path of any appointed level

				pw.println(String.format("name of count(%d) is: %s", i, path.getName(i).toString()));
			}
			pw.println("root: " + path.getRoot());
			pw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
