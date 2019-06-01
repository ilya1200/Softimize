/**
 * 
 */
package DataStructures;
import java.util.*;  
import Interfaces.*;

/**
 * @author ilya Livshits
 *
 */

//Java program to implement Max Heap 
public class MaxHeap { 
	private List<Entity> heap;  

	// Constructor to initialize an 
	// empty max heap with given maximum 
	// capacity. 
	public MaxHeap() 
	{ 
		this.heap = new ArrayList<Entity>(); 
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
		Collections.swap(this.heap, fpos, spos);
	} 

	// A recursive function to max heapify the given 
	// subtree. This function assumes that the left and 
	// right subtrees are already valid heaps, we only need 
	// to fix the root. 
	private void heapifyDown(int pos) 
	{ 
		int left =this.leftChild(pos);
		int right = this.rightChild(pos);
		int n = this.heap.size();
		
		int largest = pos;
		
		if(left<n && this.heap.get(left).getValue()>this.heap.get(pos).getValue()) {
			largest=left;
		}
		
		if(right<n && this.heap.get(right).getValue()>this.heap.get(largest).getValue()) {
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
		
		if(this.heap.get(parent).getValue() < this.heap.get(pos).getValue()) {
			this.exchange(parent, pos);
			this.heapifyUp(pos);
		}
	}

	//Inserts a new element to max heap 
	public void insert(Entity element) 
	{ 
		this.heap.add(element);
		this.heapifyUp(this.heap.size()-1);
		
	} 


	// Remove an element from max heap 
	public Entity extractMax() 
	{ 
		if(this.heap.isEmpty() == true) {
			return null;
		}
		
		Entity max = this.heap.get(0);
		this.heap.set(0, this.heap.get(this.heap.size()-1));
		this.heap.remove(this.heap.size()-1);
		this.heapifyDown(0);
		
		return max;
	} 

} 
