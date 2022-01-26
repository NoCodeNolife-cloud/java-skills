import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 项目名:  untitled
 * 开发者:  Administrator
 * 创建于:  2022 一月 26 星期三 14:43
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {

			File outFile = new File("./src/main/resources/out.txt");
			if (!outFile.exists()) {// file not found

				outFile.createNewFile();// file create
			}
			FileWriter fileWriter = new FileWriter(outFile);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);// output file
			try (Socket socket = new Socket("time-A.timefreq.bldrdoc.gov", 13)) {

				InputStream inputStream = socket.getInputStream();// get socket inputstream
				Scanner scanner = new Scanner(inputStream);// scanner

				while (scanner.hasNext()) {

					bufferedWriter.write(scanner.nextLine() + "\n");// write file
					bufferedWriter.flush();
				}
				scanner.close();// release
			}
			bufferedWriter.close();// release
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
