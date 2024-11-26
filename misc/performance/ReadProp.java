package performance;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProp {

	public String getValue(String key, String path) throws IOException {
		Properties properties = new Properties();

		try (InputStream input = new FileInputStream(path)) {
			// Load the properties file
			properties.load(input);
			// Accessing properties
			String value = properties.getProperty(key);
			return value;
		}
	}
	
//	public static void main(String[] args) throws IOException {
//		System.out.println(getValue("count","./misc/endpointurls.properties"));
//	}
	
}
