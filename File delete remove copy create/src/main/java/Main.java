import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 项目名:  File delete remove copy
 * 开发者:  Administrator
 * 创建于:  2022 一月 23 星期日 17:43
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {

			Path path = Paths.get("./src/main/resources/test");
			File file = path.toFile();
			File[] files = file.listFiles();

			// print all files in test file
			System.out.println("test file:");
			for (File f : files) {

				System.out.println(f.getName());
			}

			// test delete file
			Path deleteFilePath = Paths.get("./src/main/resources/target/test.txt");
			if (deleteFilePath.toFile().exists()) {// if file is exists
				Files.delete(deleteFilePath);
			}

			// test copy file
			Path copySourcePath = Paths.get("./src/main/resources/test/copy file.txt");
			Path copyTargetPath = Paths.get("./src/main/resources/target/test.txt");// 将copy file.txt复制为test.txt
			Files.copy(copySourcePath, copyTargetPath);

			// test move file
			Path moveSourcePath = Paths.get("./src/main/resources/test/move file.txt");
			Path moveDestPath = Paths.get("./src/main/resources/target/move file.txt");// 将文件名称设置为move already.txt， 文件内容不变
			Files.move(moveSourcePath, moveDestPath);

			// test create file
			Path createFilePath = Paths.get("./src/main/resources/target/create file.txt");
			Files.createFile(createFilePath);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
