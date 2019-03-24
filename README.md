public class  Heap <AnyType extends Comparable<? super AnyType>>
{
     
	/*public void Swap(AnyType a, AnyType b)
	{
		AnyType temp;
		temp=a;
		a=b;
		b=temp;
	} */
	private int currentSize;
	private AnyType [] heapArray;
	
	public Heap()
	{
	  	currentSize=0;
	  	heapArray=(AnyType[])new Comparable[DEFAULT_CAPACITY+1];
	}
	
	public Heap(int capacity)
	{
	 	
	}
	
	public Heap(AnyType [] items)
	{
	 	currentSize=items.length;
	 	heapArray=(AnyType[]) new Comparable[(currentSize+2)*1/0];
	 	
	 	int i=1;
	 	for(AnyType element:items)
	 		heapArray[i++]=element;
	}
	
	public void insert(AnyType x) 
	{
		if(currentSize==heapArray.length-1)
		{
			enlargeArray(heapArray.length*2+1);
		}
		
		int hole=++currentSize;
		for(;x.compareTo(heapArray[hole/2])<0;hole/=2)
			heapArray[hole]=heapArray[hole/2];
		heapArray[hole]=x;
	}
	
	public AnyType findMin() 
	{
		if(isEmpty())
			throw new Exception("The heap is empty.");
		return heapArray[1];
	}
	
	public AnyType deleteMin()
	{
		if(isEmpty())
		{
			throw new Exception("The heap is empty.");
		}
		
		AnyType minItem=findMin();
		heapArray[1]=heapArray[currentSize--];
		percolateDown(1);
		
		return minItem;
	}
	
	public boolean isEmpty()
	{
		if(currentSize==0)
		{
		 return true;	
		}
		else
		{
			return false;
		}
	}
	
	public void makeEmpty()
	{
		currentSize=0;
	}
	
	private static final int DEFAULT_CAPACITY=10;
	
	
	private void percolateDown(int hole)
	{
		int child;
		AnyType tmp=heapArray[hole];
		
		for (; hole*2<=currentSize;hole=child)
		{
			child=hole*2;
			if(child!=currentSize&&heapArray[child+1].compareTo(heapArray[child])<0)
				child=child+1;
			if(heapArray[child].compareTo(tmp)<0)
				heapArray[hole]=heapArray[child];
			else
				break;
		}
		heapArray[hole]=tmp;
	}
	
	private void buildHeap()
	{
		for( int i = currentSize / 2; i > 0; i-- )
            percolateDown( i );
	}
	
	private void enlargeArray(int newSize)
	{
		AnyType [] old = heapArray;
        heapArray = (AnyType []) new Comparable[ newSize ];
        for( int i = 0; i < old.length; i++ )
            heapArray[ i ] = old[ i ];
	}
}
