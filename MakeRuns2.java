import java.io.*;
import java.util.*;

public class MakeRuns2 {

    public static void main (String [] args) {
	ArrayList<String> runs = new ArrayList<String>();
	try (BufferedReader br = new BufferedReader(new FileReader("mobydick.txt")))
	    {
		String sCurrentLine;

		while ((sCurrentLine = br.readLine()) !=  null) {
		    runs.add(sCurrentLine);
		}
	    }catch (IOException e) {
	    e.printStackTrace();
	}

	runs.forEach(System.out::println);
    }
}
//	ArrayList<String> runs = readFiles("mobydick.txt");
//	System.out.println(Arrays.toString(list.toArray));
