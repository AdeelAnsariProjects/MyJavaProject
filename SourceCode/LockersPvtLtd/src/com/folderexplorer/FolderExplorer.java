package com.folderexplorer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FolderExplorer 
{
	static final String folderpath="E:\\FullStackJavaDeveloper\\MyJavaProject\\LockersFolder"; 
	public static void main(String[] args)
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
		boolean isSaved = AddFile.createFiles(folderpath, fileName, content);
		
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

}
