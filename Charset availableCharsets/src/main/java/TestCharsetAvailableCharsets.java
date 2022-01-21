import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 项目名:  Charset availableCharsets
 * 开发者:  Administrator
 * 创建于:  2022 一月 21 星期五 20:07
 * 描述:
 */
public class TestCharsetAvailableCharsets {

	private static Logger log = Logger.getLogger("TestCharsetAvailableCharsets");

	public static void main(String[] args) throws IOException {
		log.setLevel(Level.ALL);
		File file = new File("./src/main/resources/out.txt");
		if (!file.exists()) {
			if (file.createNewFile()) {
				log.info("create file");
			} else {
				log.info("create file failure");
			}
		} else {
			log.info("file exist");
		}

		FileWriter filewriter = new FileWriter(file, true);
		PrintWriter printWriter = new PrintWriter(filewriter);
		Map<String, Charset> charset = Charset.availableCharsets();
		for (String name : charset.keySet()) {
			printWriter.println(name);
			printWriter.flush();
		}
		printWriter.close();
	}
}
