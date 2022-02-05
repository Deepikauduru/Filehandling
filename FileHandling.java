package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) {
		
		
		System.out.println("choose\n1.Create a File\n2.write a File\n3.Read a File\n4.Append a File");
		Scanner sc=new Scanner(System.in);
	    String user=sc.next();
		
		File file=new File("D:\\Deepika\\datafile.txt");
		
		
	    switch(user) {
	    
	    case"1":
	
		//Create file
			try {
			if(file.createNewFile()) {
				System.out.println("Created a File");
					
			}
			else {
				System.out.println("File already Exist");
			}
			}
			catch(IOException e) {
				System.out.println(e);
			}
			break;
			
	    case "2":
	    	
	    	//write file
	    	
	    	try {
	    		String data ="Deepika,AP,Gudur";
	    		FileWriter writer =new FileWriter("D:\\Deepika\\datafile.txt");
	    		writer.write(data);
	    		writer.close();
	    		System.out.println("Data Succesfully Written ");
	    		}
	    		catch(IOException e) {
	    			System.out.println("Data already Exist");
	    		}
	    	break;
	    	
	    case "3":
	    	
	    	//read file
	    	try {
	    		char[] data= new char[100];
	    		
	    		FileReader fr =new FileReader("D:\\Deepika\\datafile.txt");
	    		fr.read(data);
	    		fr.close();
	    		System.out.println("Data Succesfully Read");
	    		}
	    		catch(IOException e) {
	    			System.out.println("Data already Exist");
	    		}
	    	break;
	    	
	    case "4":
	    	
	    	//append file
	    	try {
	    		String data="I am from India";
	    		
	    		FileWriter fw=new FileWriter("D:\\Deepika\\datafile.txt",true);
	    		fw.write(data);
	    		fw.close();
	    		System.out.println("Data Succesfully appended");
	    		}
	    		catch(IOException e) {
	    			System.out.println("Data already Exist");
	    		}
	    	break;
	    	default:
	    		System.out.println("choose correct file handling");
	    		break;
		
	}
	    System.out.println();

	}

}
