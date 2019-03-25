import java.io.*;
import java.util.*;

public class MinHeap { private String[] Heap; private int size; private int maxsize;

    private static final int FRONT = 1; 
  
    public MinHeap(int maxsize) 
    { 
        this.maxsize = maxsize; 
        this.size = 0; 
        Heap = new String[this.maxsize + 1]; //  Adds 1 to length of array to accomodate for empty i[0]
        Heap[0] = ""; //Creates an empty spot at the 0 index of "heap" (the array")  Heap is theoretically still size 5.
    } 
  
    
    private int parent(int pos) 
    { 
        return pos / 2; 
    } 
  
    
    private int leftChild(int pos) 
    { 
        return (2 * pos); 
    } 
  
     
    private int rightChild(int pos) 
    { 
        return (2 * pos) + 1; 
    } 
  
   
    private boolean isLeaf(int pos) 
    { 
        if (pos >= (size / 2) && pos <= size) { 
            return true; 
        } 
        return false; 
    } 
  
     
    private void swap(int fpos, int spos) 
    { 
        String tmp; 
        tmp = Heap[fpos]; 
        Heap[fpos] = Heap[spos]; 
        Heap[spos] = tmp; 
    } 
  
     
    private void minHeapify(int pos) 
    { 
  
        
        if (!isLeaf(pos)) { 
            if (Heap[pos].compareTo(Heap[leftChild(pos)])>0 
                || Heap[pos].compareTo(Heap[rightChild(pos)]) >0) { 
  
               
                if (Heap[leftChild(pos)].compareTo(Heap[rightChild(pos)]) < 0) { 
                    swap(pos, leftChild(pos)); 
                    minHeapify(leftChild(pos)); 
                } 
  
               
                else { 
                    swap(pos, rightChild(pos)); 
                    minHeapify(rightChild(pos)); 
                } 
            } 
        } 
    } 
  
    
    public void insert(String element) 
    { 
        Heap[++size] = element; 
        int current = size; 
  
        while (Heap[current].compareTo(Heap[parent(current)]) < 0) { 
            swap(current, parent(current)); 
            current = parent(current); 
        } 
    } 
  
     
    public void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" PARENT : " + Heap[i] 
                     + " LEFT CHILD : " + Heap[2 * i] 
                   + " RIGHT CHILD :" + Heap[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
  
   
    public void minHeap() 
    { 
        for (int pos = (size / 2); pos >= 1; pos--) { 
            minHeapify(pos); 
        } 
    } 
  
  
    public String remove() 
    { 
        String popped = Heap[FRONT]; 
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT); 
        return popped; 
    } 
  
   
    public static void main(String[] arg) 
    {
	MinHeap minHeap =  new MinHeap(6);
	try (BufferedReader br = new BufferedReader(new FileReader("mobydick.txt")))
	    {
		String sCurrentLine;
		int i = 0;
		while ((sCurrentLine = br.readLine()) != null && i < 5 ) {
		    if (sCurrentLine.length() > 0){ //Ignores empty line
			minHeap.insert(sCurrentLine); //adds line into heap
			i++; //go to next line in heap
		    }
		    else { //if you see a empty line.
			}
		}
		// minHeap.minHeap();
		minHeap.print();
		
		System.out.println("The Min val is " + minHeap.remove()); 
	    }catch (IOException e) {
	    e.printStackTrace();
	}
	
		
	
        // System.out.println("The Min Heap is "); 
        // MinHeap minHeap = new MinHeap(15); 
        // minHeap.insert("kk"); 
        // minHeap.insert("llll"); 
        // minHeap.insert("abd"); 
        // minHeap.insert("dijnk"); 
        // minHeap.insert("dijni"); 
        // minHeap.insert("cinonind"); 
        // minHeap.insert("cionoinifhd"); 
        // minHeap.insert("oinonowfhhdiso"); 
        // minHeap.insert("09nh9iuhdfs9");
	// minHeap.remove();
        // minHeap.minHeap(); 
  
        // minHeap.print(); 
       
    }

}
