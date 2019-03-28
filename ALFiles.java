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




public class ALFiles {
    public static void main (String [] args) throws IOException {
	boolean firstFile = true;
	String inFilePath = "mobydick.txt";
	String[] outFilePaths= {"a1.txt", "a2.txt"};
	String sCurrentLine;
	/*Uses BufferedReader with underlying FileReader to read mobydick.txt.
	 *BufferedWriter writes from input file to output file
	 */
	int j = 0;

	try {
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    bufferedReader.readLine();
	    //System.out.println(strLine);
	    FileWriter fw = new FileWriter("a1.txt");
	    BufferedWriter a1     = new BufferedWriter(fw);
	    ///BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	     // writer.write(strLine, 0, strLine.length());
	     //writer.flush();
	     //  bufferedReader.close();
	     // writer.close();
	    
	   
	    
	    //Writer writer2= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFilePaths[1]), "utf-8"));
    
	
	     while ((sCurrentLine = bufferedReader.readLine())!= null) {
		 for (int i =0; i<5; i++){
		     if (firstFile == true) {
			 if (sCurrentLine.length() > 0) {
			     a1.write(sCurrentLine);
			     //	writer.newLine();
			     //	if (i == 4) {
				
			     //  firstFile = false;
			     //	}
			 }
		     }
		     // if (!firstFile)
		     //     if (sCurrentLine.length() > 0) {
		     // 	writer2.write(sCurrentLine);
		     // 	//	writer2.newLine();
		     // 	if (i == 4) {
				     
			// 	    firstFile = true;
			// 	}
			//     }
		    }
		
		    
		    
	}
	bufferedReader.close();
	a1.close();
	//	writer2.close();
		
	}	catch (IOException e) {
	    System.out.println("Error.");
	    e.printStackTrace();
	}
    }
    
}			
	
// String [] fileNames = {"a1.txt", "a2.txt", "b1.txt", "b2.txt"};
// try(  BufferedReader br = new BufferedReader(new FileReader("mobydick.txt")))
//     {
	 //    //FileWriter fw = new FileWriter("mobydick.txt");
	 //      //BufferedWriter writer1= new BufferedWriter(fw);
	 //    BufferedWriter writer1 = null;
	  
	 //    String sCurrentLine;
	 //    int i = 0;
	 //    int x = 0;
	 //    while ((sCurrentLine = br.readLine()) != null         ){
	 // 	//	for (int i = 0; i < 5; i++) {
	 // 	//if (sCurrentLine.length() > 0){
	 // 	System.out.printf("%d\n", i);
	 // 	writer1=new BufferedWriter(new FileWriter(fileNames[0]));
	 // 	writer1.write(    "hhhhhh"       );
	 // 	writer1.close();
	 // 	//	}
			
	 // 	//	}
	 //    }
			
		       
		    
        

	    // for (int i = 0; i < fileNames.length  ; i++ ) { //for each file in the String array fileNames
	    // 	System.out.printf("%d\n", i); //
	    // 	writer1 = new BufferedWriter(new FileWriter(fileNames[i]));
	    // 	writer1.write("java is object oriented");
	    // 	writer1.close();
	    // }
	    // for (int i = 0; i < 2; i++) {
	    // 	writer1 = new BufferedWriter(new FileWriter("mobydick.txt"));
	    // 	writer1.write(readLine());
					     
	    // }
	    // File a1 = new File ("a1.txt");
	    // File a2 = new File ("a2.txt");
	    // File b1 = new File ("b1.txt");
	    // File b2 = new File ("b2.txt");
	    // ArrayList<File> allFiles = new ArrayList<>();
	
	    // allFiles.add(b1);
	    // allFiles.add(b2);
	    // allFiles.add(a1);
	    // allFiles.add(a2);
	

	
			   
	//	allFiles.addAll(fileList);
	//	allFiles.add("b2.txt");
	//	allFiles.add("c1.txt");
	//	allFiles.add("c2.txt");
	    //	System.out.println(allFiles.size());
	//	System.out.println(allFiles.contains(b1));
	
	
	// writer.write("First Line");

	// writer.newLine();
	// writer.write("Second Line");
	// writer.close();

	// FileReader fr = new FileReader("a1.txt");
	// BufferedReader ReadFileBuffer = new BufferedReader (fr);
	// System.out.println(ReadFileBuffer.readLine());
	// System.out.println(ReadFileBuffer.readLine());

	// ReadFileBuffer.close();

	//	writer.write("7");
	//	writer.println("The first line");
	//	writer.println("The second line");
	//	writer.close();

	// try {
	//     in = new FileInputStream("mobydick.txt"); //Specified file becomes file w/ input
	//     out = new FileOutputStream("put.txt"); //Creates a new file to take in input.

	//     int c;
	//     while ((c = in.read()) != -1) { //While text still to be read == True, write to output file, "out".
	// 	out.write(c);
	//     }
	// }   finally {
	//     if (in != null) { //closes the file when it is empty? empty doesn't mean null...
	// 	    in.close();
	// 	}
	//     if (out != null) { //closes the file and mem associated with it being open etc.
	// 	    out.close();
	// 	}
	// }

       
