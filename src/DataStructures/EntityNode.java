/**
 * 
 */
package DataStructures;
import Interfaces.Entity;
/**
 * @author ilya Livshits
 *
 */
public class EntityNode implements Entity{
	protected int _value;
	protected EntityNode _next;
	
	/**
	 * Creates a node , set the _next to null
	 */
	public EntityNode(int value) {
		this._value=value;
		this._next=null;
	}
	
	/**
	 * @return the value - The key
	 */
	public int getValue() {
		return this._value;
	}

	/**
	 * @return the _next
	 */
	public EntityNode get_next() {
		return _next;
	}

	/**
	 * @param _next the _next to set
	 */
	public void set_next(EntityNode _next) {
		this._next = _next;
	}
	
	
	/**
	 * Sets _next to null
	 */
	public void reset_next() {
		this.set_next(null);
	}

}
