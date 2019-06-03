package mTests;


import DataStructures.EntityNode;
import DataStructures.MaxHeap;

public class MaxHeapTest {
	
	public static void testMaxHeap() {
		MaxHeapTest.creationTest();
		MaxHeapTest.insertionTest();
	}
	
	public static void creationTest() {
		MaxHeap mh=new MaxHeap();
		
		
		System.out.println("MaxHeapTest : creationTest");
		System.out.println("Heap should be empty, expect null :"+ mh.extractMax());
		
	}
	
	public static void insertionTest() {
		MaxHeap mh=new MaxHeap();
		int upperRange=20;
		int lowerRange=1;
		int amount =20;
		
		System.out.println("MaxHeapTest : insertionTest");
		
		System.out.println("Inserted: ");
		for(int i=0;i<amount;i++) {
			int key =  MaxHeapTest.randomNumber(lowerRange, upperRange);//Math.random();
			EntityNode ei = new EntityNode(key);
			System.out.print(key+" ");
			mh.insert(ei);
		}
		
		System.out.println();
		System.out.println("Extracted should be sorted descending: ");
		
		for(int i=0;i<amount;i++) {
			int key = mh.extractMax().getValue();
			System.out.print(key+" ");
		}
		System.out.println();
		
	}
	
	public static int randomNumber(int lower,int upper) {
		return (int)Math.floor( Math.random()*(upper-(lower)+1) )+(lower);
	}
	

}
