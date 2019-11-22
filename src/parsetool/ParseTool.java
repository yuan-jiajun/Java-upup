package parsetool;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
//import sun.plugin.dom.core.Document;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ParseTool {
    public static ArrayList<Publication> getParserAuthor() {
        ArrayList<Publication> list = new ArrayList<Publication>();
        //获取DOM解析器
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("F:\\workspace\\java\\java_test\\src\\parsetool\\PaseTool_file.xml"));

            //得到一个element根元素,获得根节点
            Element root = (Element) doc.getDocumentElement();
            System.out.println("根元素：" + root.getNodeName());

            //子节点
            NodeList personNodes = root.getElementsByTagName("publication");
            for (int i = 0; i < personNodes.getLength(); i++) {
                Element personElement = (Element) personNodes.item(i);
                Publication publication = new Publication();
                NodeList childNodes = personElement.getChildNodes();
                //System.out.println("*****"+childNodes.getLength());

                for (int j = 0; j < childNodes.getLength(); j++) {
                    if (childNodes.item(j).getNodeType() == Node.ELEMENT_NODE) {
                        if ("authors".equals(childNodes.item(j).getNodeName())) {
                            publication.setAuthors(childNodes.item(j).getFirstChild().getNodeValue());
                        } else if ("id".equals(childNodes.item(j).getNodeName())) {
                            publication.setId(childNodes.item(j).getFirstChild().getNodeValue());
                        }
                    }
                }
                list.add(publication);
            }
            for (Publication publication : list) {  //为了查看数据是否正确，进行打印结果
                System.out.println(publication.toString());
            }
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static void main(String[] args) {
        getParserAuthor();
    }
}