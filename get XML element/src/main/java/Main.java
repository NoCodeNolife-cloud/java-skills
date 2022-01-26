import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * 项目名:  XML DOM
 * 开发者:  Administrator
 * 创建于:  2022 一月 24 星期一 20:00
 * 描述:
 */
public class Main {

	public static void main(String[] args) {

		try {

			File file = new File("./src/main/resources/target.xml");
			if (!file.exists()) {

				return;
			}
			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(file);
			NodeList nodeList = doc.getElementsByTagName("supercars");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				NodeList nodeList1 = ((Element) node).getElementsByTagName("carname");
				System.out.println(node.getNodeName());
				for (int j = 0; j < nodeList1.getLength(); j++) {
					Node node1 = nodeList1.item(j);
					Element element = (Element) node1;
					System.out.println(element.getAttribute("type") + "\t" + element.getTextContent());
				}
			}
			nodeList = doc.getElementsByTagName("luxurycars");
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				NodeList nodeList1 = ((Element) node).getElementsByTagName("carname");
				System.out.println(node.getNodeName());
				for (int j = 0; j < nodeList1.getLength(); j++) {
					Node node1 = nodeList1.item(j);
					Element element = (Element) node1;
					System.out.println(element.getTextContent());
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}