package com.folderexplorer;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class AddFile 
{
	/**
	 * This method will create file in the given folder path
	 * @param folderPath
	 * @param fileName
	 * @param content
	 * @return boolean
	 */
	public static boolean createFiles(String folderPath, String fileName, List<String> content)
	{
		try
		{
			//Creating file objects
			File fl = new File(folderPath, fileName);
			FileWriter fw = new FileWriter(fl);
			
			//Adding content to file object line by line
			for(String s:content)
			{
				fw.write(s+"\n");
			}
			
			//closing object
			fw.close();
			
			//returning true if succeed
			return true;
					
		}
		catch(Exception Ex)
		{
			//return false if failed
			return false;
		}
	}
}
