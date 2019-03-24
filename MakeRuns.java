import java.util.Scanner;
import java.util.*;
import java.io.File;



public class MakeRuns {

    public static void main(String [] args) {

	ArrayList<String>  runs = readFiles("mobydick.txt");
	System.out.println(Arrays.toString(list.toArray));
    }

    public static ArrayList<String> readFiles (String file) {

	
	try {

	    File f = new File(file);
	    Scanner s = new Scanner(f);
	    int ctr = 0;
	    while (s.hasNextLine()) {
		ctr++;
		s.nextLine();

	    }
	    ArrayList<String> list = new ArrayList<String>();

	    Scanner s1 = new Scanner(f);

	    for (int i = 0; i < list.size(); i++)
		list.add(s1.nextLine());
	    return list; 
		}
	catch(Exception e) {
	    return ArrayList<String> list;

	}

    }

  
}
