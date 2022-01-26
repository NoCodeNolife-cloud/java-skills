import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * 项目名:  XML SAX
 * 开发者:  Administrator
 * 创建于:  2022 一月 26 星期三 14:01
 * 描述:
 */
public class SAXParserDemo {

	public static void main(String[] args) {

		try {
			File inputFile = new File("./src/main/resources/test.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			UserHandler userhandler = new UserHandler();
			saxParser.parse(inputFile, userhandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
