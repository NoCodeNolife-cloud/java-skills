import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 项目名:  File listFiles
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 23:09
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {
			Path path = Paths.get("./src/main/resources/out.txt");
			File outputFile = new File(path.toString());
			if (!outputFile.exists()) {
				outputFile.createNewFile();
			}
			PrintWriter printWriter = new PrintWriter(outputFile);

			File file = new File("./src/main/resources");
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++) {
				printWriter.print(files[i].toString() + "\t");
				printWriter.println(files[i].getName());
				printWriter.flush();
			}
			printWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
