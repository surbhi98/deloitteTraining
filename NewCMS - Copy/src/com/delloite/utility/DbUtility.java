package com.delloite.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {

	
		public static Connection getMyConnection() throws IOException{
			Connection conn =  null;
			FileReader reader = new FileReader("C:\\Users\\marh34\\eclipse-workspace\\CMS\\src\\com\\delloite\\customer\\mydat.properties");
			Properties properties = new Properties();
			properties.load(reader);
			String drv= properties.getProperty("driver");
			String url= properties.getProperty("url");
			String unm= properties.getProperty("username");
			String pwd = properties.getProperty("password");
			//System.out.println(unm+ pwd);
			reader.close();
			try {
				
				Class.forName(drv);
				conn=DriverManager.getConnection(url, unm, pwd);
				}
			catch(ClassNotFoundException e)
			{	e.printStackTrace();
				
			}
			catch(SQLException e)
			{		e.printStackTrace();
				
			}
			return conn;
			
			
			
			
		}
	
}
