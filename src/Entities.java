import mTests.*;
import Classes.*;

/** 
 * 
 */

/**
 * @author ilya Livshits
 *
 */
public class Entities {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityCollectionA useCaseA=new EntityCollectionA();
		EntityCollectionB useCaseB=new EntityCollectionB();
		EntityCollectionC useCaseC=new EntityCollectionC();
		
		System.out.println("::  Entities  ::");
		EntityNodeTest.testEntityNode();
		StackTest.testStack();
		MaxHeapTest.testMaxHeap();
	}

}
