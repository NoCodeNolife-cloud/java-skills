import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * 项目名:  BasicFileAttributeView BasicFileAttributes
 * 开发者:  Administrator
 * 创建于:  2022 一月 23 星期日 22:12
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {

			File file = new File("./src/main/resources/test.txt");// 获取BasicFileAttributeView
			BasicFileAttributeView basicFileAttributeView = Files.getFileAttributeView(file.toPath(), BasicFileAttributeView.class);

			BasicFileAttributes basicAttributes = basicFileAttributeView.readAttributes();
			System.out.println("creationTime " + basicAttributes.creationTime());// 创建时间
			System.out.println("lastAccessTime " + basicAttributes.lastAccessTime());// 上次打开时间
			System.out.println("lastModifiedTime " + basicAttributes.lastModifiedTime());// 上次修改时间
			System.out.println("isDirectory " + basicAttributes.isDirectory());// 是否目录
			System.out.println("size " + basicAttributes.size());// 文件大小
			System.out.println("isRegularFile " + basicAttributes.isRegularFile());// 判断文件是否是内容不透明的常规文件
			System.out.println("isSymbolicLink " + basicAttributes.isSymbolicLink());// 判断文件是否为符号链接
			System.out.println("isOther " + basicAttributes.isOther());// 判断文件是否不是常规文件、目录或符号链接
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
