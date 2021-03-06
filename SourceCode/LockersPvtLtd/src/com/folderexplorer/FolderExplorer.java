package com.folderexplorer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolderExplorer 
{
	static final String folderPath="E:\\FullStackJavaDeveloper\\MyJavaProject\\LockersFolder"; 
	public static void main(String[] args)
	{
		int proceed = 1;

		do
		{
			int ch;
		
			//Application Main Menu
			ch=displayMenu();
			
			switch(ch)
			{
				case 1 : getAllFiles();
						break;
				
				case 2 : createFiles();
						break;
				
				case 3 : deleteFile();
						break;
						
				case 4 : searchFile();
						break;
						
				case 5 : System.exit(0);
						break;
						
				default : System.out.println("Invalid option selected.");
						break;
			}
		}
		while(proceed>0);
	}
	public static int displayMenu()
	{
		//Variable Declaration
		Scanner obj = new Scanner(System.in);
		int ch;

		//Application Main Menu
		System.out.println("=============================================");
		System.out.println("|  Company Lockers Pvt. Ltd. (LockedMe.com) |");		
		System.out.println("=============================================");
		System.out.println("| 1. List all the files from a directory    |");
		System.out.println("| 2. Add a file to a directory              |");
		System.out.println("| 3. Delete a file from a directory         |");
		System.out.println("| 4. Search a file in a directory           |");
		System.out.println("| 5. Exit                                   |");
		System.out.println("=============================================");
		System.out.println("Enter Your Choice:");
		ch = Integer.parseInt(obj.nextLine());
		return ch;
	}

	public static void getAllFiles()
	{
		//Variable Declaration
		List<String> fileNames = RetrieveFiles.getAllFiles(folderPath);
		
		//Listing all the files exist in the specified folder
		for(String f:fileNames)
			System.out.println(f);		
	}
	
	public static void createFiles()
	{
		//Declaring variables
		Scanner obj = new Scanner(System.in);
		String fileName;
		int linesCount;
		List<String> content = new ArrayList<String>();
		
		//Prompting user to enter file name
		System.out.println("Enter File Name:");

		//Taking file name from the user and storing in fileName variable
		fileName=obj.nextLine();
		
		//Prompting user to enter number of line he would like to add
		System.out.println("How many lines you would like to add in the file:");
		
		//Taking user input for number of lines into linesCount variable
		//linesCount=obj.nextInt();
		linesCount=Integer.parseInt(obj.nextLine());

		//running for loop for the number lines he want to add  to prompt user and take user input
		for(int i=1;i<=linesCount;i++)
		{
			//Prompting user to add line
			System.out.println("Enter line "+i+":");
			
			//Taking user input for each line and storing into content array
			content.add(obj.nextLine());
		}
		
		//saving content into the file
		boolean isSaved = AddFile.createFiles(folderPath, fileName, content);
		
		//Notifying user if the file saved successfully or not
		if(isSaved)
		{
			System.out.println("File and lines saved successfully.");
		}
		else
		{
			System.out.println("Some error occured. Please contact system admin.");
		}
	}
	
	public static void deleteFile()
	{
		//Variable Declaration
		String fileName;
		Scanner obj = new Scanner(System.in);

		//Showing user a list files that currently exists in the given folder
		List<String> fileNames = RetrieveFiles.getAllFiles(folderPath);
		
		System.out.println("LIST OF FILES:");
		
		for(String f:fileNames)
			System.out.println(f);

		//Prompting user to give file name to be deleted
		System.out.println("Enter the file name you want to delete:");
		
		//Taking file name from user input
		fileName=obj.nextLine();
		
		//Deleting file from the given folder
		boolean isDeleted = DeleteFile.deleteFile(folderPath, fileName);
		
		//Notifying user if the file deleted successfully or not
		if(isDeleted)
		{
			System.out.println("File deleted successfully.");
		}
		else
		{
			System.out.println("Either the given file is not exist or some access issue.");
		}		
	}
	
	public static void searchFile()
	{
		//Variable Declaration
		String fileName;
		Scanner obj = new Scanner(System.in);

		//Prompting user to give file name to search
		System.out.println("Enter the name of the file you want to search:");
		
		//Taking file name from user input
		fileName=obj.nextLine();
		
		//Search file from in the given folder
		boolean isExist = SearchFile.searchFile(folderPath, fileName);
		
		//Notifying user if the file exist or not
		if(isExist)
		{
			System.out.println("The specified file exist in the folder.");
		}
		else
		{
			System.out.println("Either the specified file is not exist or some access issue.");
		}		
	}
}
