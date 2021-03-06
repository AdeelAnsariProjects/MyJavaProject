package com.folderexplorer;

import java.io.File;

public class DeleteFile 
{
	/**
	 * This method will delete user specified file from the given folder
	 * @param folderPath
	 * @param fileName
	 * @return boolean
	 */
	public static boolean deleteFile(String folderPath, String fileName)
	{
		//Creating file objects
		File fl = new File(folderPath+"\\"+fileName);
		
		try
		{
			if(fl.delete())
			{
				//if file successfully deleted return true
				return true;
			}
			else
			{
				//if file id not deleted return false
				return false;
			}
		}
		catch(Exception Ex)
		{
			//if deletion is failed return false
			return false;
		}
	}
}
