import java.util.*;
import java.io.*;
public class RandomText{
   public static void main(String [] args)throws IOException
   {
      PrintWriter out = new PrintWriter(new File("random.txt"));
      Random rand = new Random();
      int number, count=0, countTwo=0;
      while(count<100)
      {
         while(countTwo<15)
         {
            number=rand.nextInt(100)+1;
            out.print(number);
	    out.print(" ");
            count++;
            countTwo++;
         }
         countTwo = 0;
         out.println();
      }
      out.close();
  }
}
