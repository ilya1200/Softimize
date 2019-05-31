/**
 * 
 */
package DataStructures;

/**
 * @author ilya Livshits
 *
 */
public class Stack {
	private EntityNode _head;
	private int _length;
	private boolean isEmpty;

	
	/**
	 * Creates an empty Stack
	 */
	public Stack() {
		this._head=null;
		this._length=0;
		this.isEmpty=true;
	}
	
	public void push(EntityNode node) {
		node.set_next(this.get_head());
		this.set_head(node);
		this.incLength();
	}
	
	public EntityNode pop() {
		if(this.isEmpty()) {
			return null;
		}
		
		EntityNode node = this.get_head();
		this.set_head(node.get_next());
		node.reset_next();
		this.decLength();
		return node;	
	}
	
	/**
	 * @return the value of the top EntityNode
	 */
	public int top() {
		int value = this.get_head().getValue();
		return value;
	}
	

	/**
	 * @return the _length
	 */
	public int get_length() {
		return _length;
	}
	

	/**
	 * @return the isEmpty
	 */
	public boolean isEmpty() {
		return isEmpty;
	}

	/**
	 * @param isEmpty the isEmpty to set
	 */
	private void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
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
	
	private void incLength() {
		this._length+=1;
		if(this._length>0) {
			this.setEmpty(false);
		}
	}
	
	private void decLength() {
		this._length-=1;
		if(this._length==0) {
			this.setEmpty(true);
		}
	}
	
}
