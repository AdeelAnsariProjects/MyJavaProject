package com.folderexplorer;

import java.io.File;

public class SearchFile 
{
	/**
	 * This method will search a file name in the specified folder
	 * @param folderPath
	 * @param fileName
	 * @return boolean
	 */
	public static boolean searchFile(String folderPath, String fileName)
	{
		//Creating file object
		File fl = new File(folderPath+"\\"+fileName);
		
		//check if file exist in the specified folder, return true if exist else false
		if(fl.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
