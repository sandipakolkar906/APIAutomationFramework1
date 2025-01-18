package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	
	public static String getValue(String key) throws IOException{
		// Open the File 
		File objfile = new File("AppConfigs/config.properties");
		// Read the File
		
		FileInputStream objfis= new FileInputStream(objfile);
		
		Properties objprop= new Properties();
		objprop.load(objfis);
		String value=objprop.get(key).toString();
		
		return value;


}

}
