import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 项目名:  PrintWriter append
 * 开发者:  Administrator
 * 创建于:  2022 一月 21 星期五 21:22
 * 描述:
 */
public class Main {

	private static Logger log = Logger.getLogger("Main");

	public static void main(String[] args) throws IOException {
		log.setLevel(Level.ALL);
		File file = new File("./src/java/resources/out.txt");
		if (!file.exists()) {
			if (file.createNewFile()) {
				log.info("create file success");
			} else {
				log.warning("create file failure");
			}
		} else {
			log.info("file exist");
		}

		// append
		FileWriter fileWriter = new FileWriter(file, true);
		
	}
}
