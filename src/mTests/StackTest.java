package mTests;


import DataStructures.EntityNode;
import DataStructures.Stack;

public class StackTest {
	
	public static void testStack() {
		StackTest.creationTest();
		StackTest.popStackTest();
	}
	
	
	public static void creationTest() {
		Stack stack=new Stack();
		
		
		System.out.println("StackTest : creationTest");
		System.out.println("Stack should be empty :"+stack.isEmpty());
		System.out.println("Stack length should be 0 :"+stack.get_length());
		System.out.println("Tring to pop from empty stack should null :"+stack.pop());
		try {
			stack.top();
		}catch(NullPointerException npe) {
			System.out.println("Tried to top an empty stack,got: "+npe.getMessage());
		}
		
	}
	
	
	
	public static void popStackTest() {
		Stack stack=new Stack();
		int upperRange=10;
		int lowerRange=1;
		int amount =100;
		System.out.println("StackTest : popStackTest");
		
		System.out.println("Pushed: ");
		for(int i=0;i<amount;i++) {
			int key =  StackTest.randomNumber(lowerRange, upperRange);//Math.random();
			EntityNode ei = new EntityNode(key);
			System.out.print(key+" ");
			stack.push(ei);
		}
		
		System.out.println();
		System.out.println("Poped: ");
		
		for(int i=0;i<amount;i++) {
			int key = stack.pop().getValue();
			System.out.print(key+" ");
		}
		System.out.println();
		
	}
	
	public static int randomNumber(int lower,int upper) {
		return (int)Math.floor( Math.random()*(upper-(lower)+1) )+(lower);
	}
	
 



}
