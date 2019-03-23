import java.util.Scanner;
import java.util.Arrays;
import java.io.File;



public class MakeRuns {

    public static void main(String [] args) {

	int [] data = readFiles("random.txt");
	System.out.println(Arrays.toString(data));
    }

    public static int [] readFiles (String file) {

	try {

	    File f = new File(file);
	    Scanner s = new Scanner(f);
	    int ctr = 0;
	    while (s.hasNextInt()) {
		ctr++;
		s.nextInt();

	}
	    int [] arr = new int[ctr];

	    Scanner s1 = new Scanner(f);

	    for (int i = 0; i < arr.length; i++)
		arr[i] = s1.nextInt();
	    return arr;
	}
	catch(Exception e) {
	    return null;

	}

    }

}
