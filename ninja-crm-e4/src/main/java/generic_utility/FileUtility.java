package generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src\\test\\resources\\commonData.properties");

		Properties pObj = new Properties();
		pObj.load(fis);

		String value = pObj.getProperty(key);
		return value;
	}

	public static void main(String[] args) throws IOException {
		FileUtility fUtil = new FileUtility();
		String value = fUtil.getDataFromPropFile("bro");
		System.out.println(value);
	}
}
