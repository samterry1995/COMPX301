import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test {

  
    public static void main (String [] args) {
	String test;

        String currentLine;

	int i = 0;

	
	try {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    // br.readLine();
	    //    System.out.println(br.readLine());
	   
	    BufferedWriter a1 = new BufferedWriter(new FileWriter("a1.txt"));
	    BufferedWriter a2 = new BufferedWriter(new FileWriter("a2.txt"));
	    BufferedWriter b1 = new BufferedWriter(new FileWriter("b1.txt"));
	    BufferedWriter b2 = new BufferedWriter(new FileWriter("b2.txt"));
	    while ((currentLine = br.readLine()) != null && i < 7){
		//	System.out.println(currentLine);
		//	System.out.println(currentLine.length());
		if (currentLine.length() > 0) {
		    a1.write(currentLine);
		    a1.newLine();
		    i++;
		    // for (int i = 0; i < 5; i++) {
		    //	bw.write
		}
	    }
	    a1.close();
	    
	}catch (FileNotFoundException e) {
	    System.out.println("File not found");
	} catch (IOException e) {
	    e.printStackTrace();
	    }

	 




	
	}
    }

	
