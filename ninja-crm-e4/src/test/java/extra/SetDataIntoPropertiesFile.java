package extra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetDataIntoPropertiesFile {
	public static void main(String[] args) throws IOException {
//		get the java representation object of the physical file
		FileInputStream fis = new FileInputStream("./src/test/resources/cd2.properties");

//		load() -> Load all the keys from prop file
		Properties pObj = new Properties();
		pObj.load(fis);

//		Set the data
		pObj.setProperty("bro", "edge");
		
//		Save
		FileOutputStream fos = new FileOutputStream("./src/test/resources/cd2.properties");
		pObj.save(fos, "Added/Updated on thurday");
	}
}
