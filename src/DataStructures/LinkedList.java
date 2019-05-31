/**
 * 
 */
package DataStructures;

/**
 * @author ilya Livshits
 *
 */
public class LinkedList {
	private EntityNode _head;
	
	/**
	 * 
	 */
	public LinkedList() {
		this._head=null;
	}
	
	/**
	 * Inserts the specified node as the first element.
	 * @param node to be inserted.
	 */
	public void insert(EntityNode node) {
		node.set_next(this.get_head());
		this.set_head(node);
	}
	
	
	/**
	 * 
	 * @return A reference to the EntityNode with the max value
	 */
	public EntityNode findMax() {
		EntityNode max=this.get_head();
		
		for(EntityNode cur=max;cur!=null;cur=cur.get_next()) {
			if(cur.getValue()>max.getValue()) {
				max=cur;
			}
		}
		
		return max;
	}
	
	
	
	/**
	 * @return the _head
	 */
	private EntityNode get_head() {
		return _head;
	}

	/**
	 * @param _head the _head to set
	 */
	private void set_head(EntityNode _head) {
		this._head = _head;
	}
	


}
