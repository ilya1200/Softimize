/**
 * 
 */
package DataStructures;

/**
 * @author ilya Livshits
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
	 * Deletes the specified node from the list.
	 * @return A reference to the EntityDoubleNode that was removed from the list.
	 * @throws IllegalArgumentException if node is null
	 */
	public EntityDoubleNode delete(EntityDoubleNode node) {
		if(node==null) {
			throw new IllegalArgumentException("node must not be null");
		}
		
		if(node.get_prev()!=null) {
			node.get_prev().set_next(node.get_next());
		}else {
			this.set_head(node.get_next());
		}
		
		if(node.get_next()!=null) {
			node.get_next().set_prev(node.get_prev());
		}
		
		node.reset_next();
		node.reset_prev();
		
		return node;
	}
	
	/**
	 * 
	 * @return A reference to the EntityNode with the max value
	 * @throws NullPointerException if the list is empty
	 */
	public EntityDoubleNode findMax() {
		EntityDoubleNode max=this.get_head();
		
		if(this.isEmpty()) {
			throw new NullPointerException("The list is empty");
		}
		
		for(EntityDoubleNode cur=max;cur!=null;cur=cur.get_next()) {
			if(cur.getValue()>max.getValue()) {
				max=cur;
			}
		}
		
		return max;
	}
	
	/**
	 * @return the isEmpty
	 */
	private boolean isEmpty() {
		return this.get_head()==null;
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
