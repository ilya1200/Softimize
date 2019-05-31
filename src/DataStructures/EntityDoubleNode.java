/**
 * 
 */
package DataStructures;

/**
 * @author ilya Livshits
 *
 */
public class EntityDoubleNode extends EntityNode{
	private EntityDoubleNode _prev;
	/**
	 * @param value
	 */
	public EntityDoubleNode(int value) {
		super(value);
		this._prev=null;
	}
	
	/**
	 * @return the _next
	 */
	@Override
	public EntityDoubleNode get_next() {
		return (EntityDoubleNode)(super.get_next());
	}

	/**
	 * @return the _prev
	 */
	public EntityDoubleNode get_prev() {
		return _prev;
	}

	/**
	 * @param _prev the _prev to set
	 */
	public void set_prev(EntityDoubleNode _prev) {
		this._prev = _prev;
	}
	
	
	/**
	 * Sets _prev to null
	 */
	public void reset_prev() {
		this.set_prev(null);
	}


}
