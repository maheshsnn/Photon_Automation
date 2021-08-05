package API_With_Selenium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author Mahesh
 *
 */
public class API_Practice {

	public static void main(String[] args) throws Exception {

		String sxml = API_Practice.getdoc("http://api.geonames.org/weatherIcao?ICAO=LSZH&username=rheh&style=full");
		Document doc = API_Practice.LoadFromXML(sxml);

		Element el = doc.getDocumentElement();
		System.out.println(API_Practice.gettext(el, "ICAO"));

	}

	/**
	 * This block is used to get values using nodes(similar to key value pairs)
	 * 
	 * @param ele
	 * @param tagname
	 * @return
	 */

	public static String gettext(Element ele, String tagname) {
		String Textval = "";

		NodeList nl = ele.getElementsByTagName(tagname);

		if (nl != null && (nl.getLength() > 0)) {
			Element el = (Element) nl.item(0);
			Textval = el.getFirstChild().getNodeValue();

		}

		return Textval;
	}

	/**
	 * Below block is used to load xml in to our program
	 * 
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	public static Document LoadFromXML(String xml) throws Exception {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource is = new InputSource(new StringReader(xml));
		return builder.parse(is);

	}

	/**
	 * Below block is used to create connection using API and Geting response
	 * 
	 * @param urltoload
	 * @return
	 * @throws Exception
	 */

	public static String getdoc(String urltoload) throws Exception

	{
		URL url;
		HttpURLConnection conn;
		String line;
		BufferedReader rd;
		String result = "";

		url = new URL(urltoload);

		conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");

		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));

		while ((line = rd.readLine()) != null) {
			result += line;

		}

		return result;

	}

}
