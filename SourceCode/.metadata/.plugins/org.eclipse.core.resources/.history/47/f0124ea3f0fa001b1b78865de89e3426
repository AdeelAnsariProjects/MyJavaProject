package com.folderexplorer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RetrieveFiles 
{
	public static List<String> getAllFiles(String folderpath)
	{
		//Creating file objects
		File folderName = new File(folderpath);
		
		//Getting all the files into FileArray
		File[] listOfFiles = folderName.listFiles();
		
		//Declared a list to store file names
		List<String> fileName = new ArrayList<String>();
		
		//Getting file name one by one and adding into fileName
		for(File f:listOfFiles)
			fileName.add(f.getName());
		
		//return the list
		return fileName;
	}
}
