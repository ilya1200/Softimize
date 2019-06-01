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

	/**
	 * 
	 */
	public EntityCollectionB() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void add(Entity entity) {
		EntityDoubleNode entDoubleNode = new EntityDoubleNode(entity.getValue());
	}

	public Entity removeMaxValue() {
		return null;
	}

}
