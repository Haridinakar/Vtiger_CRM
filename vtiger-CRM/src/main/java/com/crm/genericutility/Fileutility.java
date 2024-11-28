package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	/**
	 * This method is used to read data user pass the key it return value
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromProperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/commondata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
