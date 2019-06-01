/**
 * 
 */
package DataStructures;

/**
 * @author ilya Livshits
 *
 */

//Java program to implement Max Heap 
public class MaxHeap { 
	private int[] heap; 
	private int heapSize; 
	private int maxsize; 

	// Constructor to initialize an 
	// empty max heap with given maximum 
	// capacity. 
	public MaxHeap(int maxsize) 
	{ 
		this.maxsize = maxsize; 
		this.heapSize = 0; 
		this.heap = new int[this.maxsize]; 
	} 

	// Returns position of parent 
	private int parent(int pos) 
	{ 
		return (pos - 1)/2; 
	} 

	// Below two functions return left and 
	// right children. 
	private int leftChild(int pos) 
	{ 
		return (2 * pos)+1; 
	} 
	private int rightChild(int pos) 
	{ 
		return (2 * pos) + 2; 
	} 

	private void exchange(int fpos, int spos) 
	{ 
		int tmp; 
		tmp = this.heap[fpos]; 
		this.heap[fpos] = this.heap[spos]; 
		this.heap[spos] = tmp; 
	} 

	// A recursive function to max heapify the given 
	// subtree. This function assumes that the left and 
	// right subtrees are already valid heaps, we only need 
	// to fix the root. 
	private void heapifyDown(int pos) 
	{ 
		int left =this.leftChild(pos);
		int right = this.rightChild(pos);
		int n = this.heapSize;
		
		int largest = pos;
		
		if(left<n && this.heap[left]>this.heap[pos]) {
			largest=left;
		}
		
		if(right<n && this.heap[right]>this.heap[largest]) {
			largest=right;
		}
		
		if(largest!=pos) {
			this.exchange(pos, largest);
			this.heapifyDown(largest);
		}
		
	} 
	
	
	private void heapifyUp(int pos) {
		if(pos <= 0) {
			return;
		}
		
		int parent=this.parent(pos);
		
		if(this.heap[parent] < this.heap[pos]) {
			this.exchange(parent, pos);
			this.heapifyUp(pos);
		}
	}

	//Inserts a new element to max heap 
	public void insert(int element) 
	{ 
		this.heapSize++;
		
//		if(this.heapSize>this.maxsize) {  EXTEND THE HEAP ARRAY
//			this.heap=extend(this.heap);
//			this.maxsize=this.heap.length;
//		}
		this.heap[this.heapSize-1]=element;
		this.heapifyUp(this.heapSize-1);
		
	} 


	// Remove an element from max heap 
	public int extractMax() 
	{ 
		if(this.heapSize<1) {
			return -1; //Should be ERROR - heap underflow
		}
		
		int max = this.heap[0];
		this.heap[0]=this.heap[this.heapSize-1];
		this.heapSize--;
		this.heapifyDown(0);
		
		return max;
	} 

} 
