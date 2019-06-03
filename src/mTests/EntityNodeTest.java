package mTests;

import DataStructures.EntityNode;

public class EntityNodeTest {

	public static void testEntityNode() {
		EntityNode e1= new EntityNode(4);
		EntityNode e2= new EntityNode(5);
		
		
		System.out.println("EntityNodeTest : testEntityNodeCreation");
		System.out.println("e1 created with value 4 : "+e1.getValue());
		System.out.println("e2 created with value 5 : "+e2.getValue());
		
		e1.set_next(e2);
		System.out.println("e1 next set to e2 : "+e1.get_next().getValue());
		
		e1.reset_next();
		System.out.println("e1 next reset to null  : "+e1.get_next());
		
	}
}
