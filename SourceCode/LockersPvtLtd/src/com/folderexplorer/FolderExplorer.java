package com.folderexplorer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolderExplorer 
{
	static final String folderPath="E:\\FullStackJavaDeveloper\\MyJavaProject\\LockersFolder"; 
	public static void main(String[] args)
	{
		//Variable Declaration
		String fileName;
		Scanner obj = new Scanner(System.in);

		//Showing user a list files that currently exists in the given folder
		List<String> fileNames = RetrieveFiles.getAllFiles(folderPath);
		
		System.out.println("List of files:");
		
		for(String f:fileNames)
			System.out.println(f);

		//Prompting user to give file name to be deleted
		System.out.println("Enter the file name you want to delete:");
		
		//Taking file name from user input
		fileName=obj.nextLine();
		
		//Deleting file from the given folder
		boolean isDeleted = DeleteFile.deleteFile(folderPath, fileName);
		
		if(isDeleted)
		{
			System.out.println("File deleted successfully.");
		}
		else
		{
			System.out.println("Either the given file is not exist or some access issue.");
		}
	}

}
