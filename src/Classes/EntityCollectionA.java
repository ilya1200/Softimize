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
public class EntityCollectionA implements EntityCollection{
	private DoubleLinkedList _doubleLinkedList;
	
	/**
	 * 
	 */
	public EntityCollectionA() {
		this._doubleLinkedList=new DoubleLinkedList();
	}
	
	
	public void add(Entity entity) {
		EntityDoubleNode entDoubleNode = new EntityDoubleNode(entity.getValue());
		this._doubleLinkedList.insert(entDoubleNode);
	}

	public Entity removeMaxValue() {
		EntityDoubleNode entDoubleNode=this._doubleLinkedList.findMax();
		entDoubleNode=this._doubleLinkedList.delete(entDoubleNode);
		return entDoubleNode;
	}
}
