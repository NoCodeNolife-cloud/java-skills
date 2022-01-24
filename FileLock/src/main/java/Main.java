import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/**
 * 项目名:  FileLock
 * 开发者:  Administrator
 * 创建于:  2022 一月 24 星期一 13:42
 * 描述:
 */
public class Main {

	public static void main(String[] args) {
		try {
			File file = new File("./src/main/resources/test.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			WriteFile writeFile = new WriteFile(file);
			WriteFile writeFile1 = new WriteFile(file);
			writeFile.start();
			writeFile1.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class WriteFile extends Thread {

		File file;

		public WriteFile(File file) {
			this.file = file;
		}

		// 互斥方法一
		// @Override
		// public synchronized void run() {
		// 	try {
		// 		FileWriter fileWriter = new FileWriter(file, true);
		// 		PrintWriter printWriter = new PrintWriter(fileWriter);
		// 		for (int i = 0; i < 10; i++) {
		// 			printWriter.println(getName() + "\t" + i);
		// 			printWriter.flush();
		// 		}
		// 	} catch (IOException e) {
		// 		e.printStackTrace();
		// 	}
		// }


		@Override
		public void run() {
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(file);
				FileWriter fileWriter = new FileWriter(file, true);
				FileLock fileLock;
				while (true) {
					try {
						fileLock = fileOutputStream.getChannel().lock();
						break;
					} catch (OverlappingFileLockException e) {
						sleep(1000);
					}
				}
				for (int i = 0; i < 10; i++) {
					fileWriter.write(getName() + "\t" + i + "\n");
					// fileWriter.flush();
				}
				fileLock.release();
				fileWriter.close();
				fileOutputStream.close();
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
