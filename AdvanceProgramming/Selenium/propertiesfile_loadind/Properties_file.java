package propertiesfile_loadind;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_file {
	
	Properties prop;
	
	public Properties_file() throws IOException
	{
		File f=new File("");
		FileInputStream fis=new FileInputStream(f);
		prop =new Properties();
		prop.load(fis);
		
		
	}
	
	public String username()
	{
		
		String uname=prop.getProperty("username");
		return uname;
	}
	
	public String password()
	{
		
		String uname=prop.getProperty("password");
		return uname;
	}
	
	
	

}
