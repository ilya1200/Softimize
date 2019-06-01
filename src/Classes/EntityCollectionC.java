

/**
 * 
 */
package Classes;

import Interfaces.*;
import DataStructures.*;

/**
 * @author ilya Livshits
 *
 */
public class EntityCollectionC implements EntityCollection{
	private Stack primaryStack;
	private Stack secondaryStack;
	
	
	
	/**
	 * @param stackPrimary
	 * @param stackSecondary
	 */
	public EntityCollectionC() {
		this.primaryStack = new Stack();
		this.secondaryStack = new Stack();
	}

	public void add(Entity entity) {
		EntityNode entNode = new EntityNode(entity.getValue());
		
		while(!(this.primaryStack.isEmpty()) && (entNode.getValue() <= this.primaryStack.top()) ) {
			this.secondaryStack.push(this.primaryStack.pop());
		}
		
		this.primaryStack.push(entNode);
		
		while(!(this.secondaryStack.isEmpty())) {
			this.primaryStack.push(this.secondaryStack.pop());
		}
	}

	public Entity removeMaxValue() {
		return this.primaryStack.pop();
	}
	
}
