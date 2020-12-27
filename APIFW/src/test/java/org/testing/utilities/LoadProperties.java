package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties 
{
 public static Properties properties(String path) throws IOException
 {
	 File f=new File(path);
	 FileInputStream fi=new FileInputStream(f);
	 Properties pr=new Properties();
	 pr.load(fi);
	 return pr;
 }
}
