/**
 * 
 */
package DataStructures;

/**
 * @author ilya1
 *
 */
public class DoubleLinkedList {
	private EntityDoubleNode _head;

	/**
	 * 
	 */
	public DoubleLinkedList() {
		this._head=null;
	}
	
	/**
	 * Inserts the specified node as the first element.
	 * @param node to be inserted.
	 */
	public void insert(EntityDoubleNode node) {
		EntityDoubleNode head=this.get_head();
		
		node.set_next(head);
		if(head!=null) {
			head.set_prev(node);
		}
		
		head=node;
		node.reset_prev();
	}
	
	
	/**
	 * 
	 * @return A reference to the EntityNode with the max value
	 */
	public EntityDoubleNode findMax() {
		EntityDoubleNode max=this.get_head();
		
		for(EntityDoubleNode cur=max;cur!=null;cur=(EntityDoubleNode) cur.get_next()) {
			if(cur.getValue()>max.getValue()) {
				max=cur;
			}
		}
		
		return max;
	}
	
	
	
	/**
	 * @return the _head
	 */
	private EntityDoubleNode get_head() {
		return _head;
	}

	/**
	 * @param _head the _head to set
	 */
	private void set_head(EntityDoubleNode _head) {
		this._head = _head;
	}

}
