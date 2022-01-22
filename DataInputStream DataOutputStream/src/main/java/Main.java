import java.io.*;
import java.util.logging.Logger;

/**
 * 项目名:  DataInputStream DataOutputStream
 * 开发者:  Administrator
 * 创建于:  2022 一月 21 星期五 22:23
 * 描述:
 */
public class Main {

	private static final Logger log = Logger.getLogger("Main.java");

	public static void main(String[] args) throws IOException {
		File fileIn = new File("./src/main/resources/in.txt");
		DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileIn));

		File fileOut = new File("./src/main/resources/out.txt");
		if (!fileOut.exists()) {
			log.info("file not exist, create file...");
			fileOut.createNewFile();
		}
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileOut));

		while (dataInputStream.available() > 0) {
			int value = dataInputStream.readInt();
			log.info("value = " + value);
			dataOutputStream.writeInt(value);
		}
		dataInputStream.close();
		dataOutputStream.close();
	}
}
