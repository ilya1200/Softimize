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
public class EntityCollectionB implements EntityCollection{
	private MaxHeap maxHeap;
	/**
	 * 
	 */
	public EntityCollectionB() {
		this.maxHeap=new MaxHeap();
	}
	
	
	public void add(Entity entity) {
		this.maxHeap.insert(entity);
	}

	public Entity removeMaxValue() {
		return this.maxHeap.extractMax();
	}

}
