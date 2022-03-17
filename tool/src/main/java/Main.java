import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 项目名:  tool
 * 开发者:  Administrator
 * 创建于:  2022 三月 17 星期四 下午 3:53
 * 描述:
 */
public class Main {

	public static void main(String[] args) throws Exception {
		Path targetPath = Paths.get("H:\\programe\\GitHub-project-warehouse-manager\\Linux-system-Markdown-TakeNotes\\目录.md");
		File targetFile = targetPath.toFile();
		if (!targetFile.exists()) {
			targetFile.createNewFile();
		}
		FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		Path path = Paths.get("H:\\programe\\GitHub-project-warehouse-manager\\Linux-system-Markdown-TakeNotes\\子目录");
		File baseFile = new File(path.toString());
		if (baseFile.isFile() || !baseFile.exists()) {
			System.exit(0);
		}
		File[] files = baseFile.listFiles();
		for (File file : files) {
			if (file.isFile()) {
				printWriter.print("[" + file.getName() + "](" + "子目录/" + file.getName() + ")\n\n");
				printWriter.flush();
			}
		}
		printWriter.close();
	}
}
