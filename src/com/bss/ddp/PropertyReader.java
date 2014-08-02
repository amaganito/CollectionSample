package com.bss.ddp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args) throws IOException {
     PropertyReader a = new PropertyReader();
		
     FileInputStream fis = new FileInputStream("C:\\Users\\Andrew\\workspace\\personal\\June23\\src\\com\\bss\\ddp\\data.properties");
     
     Properties prodata = new Properties();
     
     prodata.load(fis);
     System.out.println(prodata.getProperty("name"));
     
	}

}
