import java.io.*;
import java.util.logging.Logger;

/**
 * 项目名:  ObjectOutputStream ObjectInputStream file input and output
 * 开发者:  Administrator
 * 创建于:  2022 一月 22 星期六 13:11
 * 描述:
 */
public class Main {

	private static final Logger log = Logger.getLogger("Main.java");

	public static void main(String[] args) throws Exception {

		File writeFile = new File("./src/main/resources/in.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(writeFile));
		for (int i = 0; i < 10; i++) {
			oos.writeObject(new MyClass(i));
		}
		oos.writeObject(null);
		oos.close();

		File fileIn = new File("./src/main/resources/in.txt");
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileIn));

		File fileOut = new File("./src/main/resources/out.txt");
		if (!fileOut.exists()) {
			log.info("file not exist, create file...");
			fileOut.createNewFile();
		}
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileOut));

		MyClass myClass = (MyClass) objectInputStream.readObject();
		while (myClass != null) {
			objectOutputStream.writeObject(myClass);
			System.out.println(myClass.getValue());
			myClass = (MyClass) objectInputStream.readObject();
		}

		objectInputStream.close();
		objectOutputStream.close();
	}
}
