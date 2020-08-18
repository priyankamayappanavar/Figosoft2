package generic_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Propery156 {
	@Test
	public static void Propery156() throws FileNotFoundException, IOException
	{
		Properties p=new Properties();
		p.load(new FileInputStream("./p.properties"));
		String data=p.getProperty("city");
		String data1=p.getProperty("url");
		System.out.println(data);
		System.out.println(data1);
	}

}
