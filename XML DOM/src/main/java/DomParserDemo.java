import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

/**
 * 项目名:  XML DOM
 * 开发者:  Administrator
 * 创建于:  2022 一月 24 星期一 20:00
 * 描述:
 */
public class DomParserDemo {

	public static void main(String[] args) {

		try {

			// parse xml
			File inputFile = new File("./src/main/resources/target.xml");
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(inputFile);

			Node cars = doc.getFirstChild();
			Node supercar = doc.getElementsByTagName("supercars").item(0);

			// update supercar attribute
			NamedNodeMap attr = supercar.getAttributes();
			Node nodeAttr = attr.getNamedItem("company");
			nodeAttr.setTextContent("Lamboriginity");

			// loop the supercar child node
			NodeList list = supercar.getChildNodes();
			for (int temp = 0; temp < list.getLength(); temp++) {

				Node node = list.item(temp);
				if (node.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) node;
					if ("carname".equals(eElement.getNodeName())) {

						if ("Ferrari 101".equals(eElement.getTextContent())) {

							eElement.setTextContent("Lamborigini 001");
						}
						if ("Ferrari 202".equals(eElement.getTextContent()))

							eElement.setTextContent("Lamborigini 002");
					}
				}
			}
			NodeList childNodes = cars.getChildNodes();
			for (int count = 0; count < childNodes.getLength(); count++) {

				Node node = childNodes.item(count);
				if ("luxurycars".equals(node.getNodeName()))

					cars.removeChild(node);
			}
			// write the content on console
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			System.out.println("-----------Modified File-----------");
			StreamResult consoleResult = new StreamResult(System.out);
			transformer.transform(source, consoleResult);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}