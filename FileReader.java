
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/*
 *This class is a test class for my
 *external mergesort implementation.
 *I want to create four files/tapes (two for input; two for output)
 *in this class I will just try to get input from a text file, spli it and
 *alternate it between input/output files.
 */ 

public class FileReaderr{

    public static void main (String [] args) {

    BufferedReader readText = new BufferedReader(new FileReader("mobydick.txt"));
    String currentLine = readText.readLine();
    System.out.println(currentLine);
    }
}
