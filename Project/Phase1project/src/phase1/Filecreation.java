package phase1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filecreation {

	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);

System.out.println("enter the file name");
String file=sc.nextLine();
file=file+".txt";

Createfile(file);




	}
	public static void Createfile(String file) throws IOException {
		try {
			File newfile=new File(file);
			if(newfile.createNewFile()) {
				System.out.println("file created successfully!!!");
			}
			if(newfile.exists()) {
				System.out.println("file Already exsits duplicate  not allowed!!!!!");
			}
		} catch (Exception e) {
		e.printStackTrace();;
		}
		
		
		
	}

}
