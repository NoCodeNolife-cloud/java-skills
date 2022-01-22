import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 项目名:  PrintWriter append
 * 开发者:  Administrator
 * 创建于:  2022 一月 21 星期五 21:22
 * 描述:
 */
public class Main {

	private static Logger log = Logger.getLogger("Main.java");

	public static void main(String[] args) throws IOException {
		log.setLevel(Level.ALL);
		File file = new File("./src/main/resources/out.txt");
		if (!file.exists()) {
			if (file.createNewFile()) {
				log.info("create file success");
			} else {
				log.warning("create file failure");
			}
		} else {
			log.info("file exist");
		}

		for (int i = 0; i < 2; i++) {
			// append
			PrintWriter printWriter = new PrintWriter(new FileWriter(file, true));
			for (int j = 0; j < 10; j++) {
				printWriter.print(j);
			}
			printWriter.close();
		}
	}
}
