package mergeSort;

public class sortMerge {
  
	//private static void printArray(int[] array)
	//{
	//	for(int i:array)
	//	{
	//		System.out.println(i+" ");
	//	}
	//}
	
	public static String[] mergeSort(String[] stringarray)
	{
		if(stringarray.length<=1)
		{
			return stringarray;
		}
		
		int midpoint=stringarray.length/2;
			String[] left=new String[midpoint];
			String[] right;
		
		if(stringarray.length%2==0)
		{
			right=new String[midpoint];
		}else {
			right=new String[midpoint+1];
		}
		
		for(int i=0;i<midpoint;i++)
		{
			left[i]=stringarray[i];
		}
		
		for(int j=0;j<right.length;j++)
		{
			right[j]=stringarray[midpoint+j];
		}
		
		
		String[] result;
		result=new String[stringarray.length];
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		result=merge(left,right);
		return result;
	}
	
	private static String[] merge(String[] left,String[] right)
	{
		String[] result=new String[left.length+right.length];
		int resultPointer,leftPointer,rightPointer;
		resultPointer=0;
		leftPointer=0;
		rightPointer=0;
		while(leftPointer<left.length||rightPointer<right.length)
		{
		  if(leftPointer<left.length&&rightPointer<right.length)
		  {
			  
			  if(left[leftPointer].compareTo(right[rightPointer])<0)
			  {
				  result[resultPointer]=left[leftPointer];
				  resultPointer=resultPointer+1;
				  leftPointer=leftPointer+1;
				  
			  }
			  else
			  {
				  result[resultPointer]=right[rightPointer];
				  resultPointer++;
				  rightPointer++;
			  }
		  }
		  else if(leftPointer<left.length)
		  {
			  result[resultPointer]=left[leftPointer];
			  resultPointer++;
			  leftPointer++;
		  }
		  else
		  {
			  result[resultPointer]=right[rightPointer];
			  resultPointer++;
			  rightPointer++;
		  }
		}
		return result;
	}
}
