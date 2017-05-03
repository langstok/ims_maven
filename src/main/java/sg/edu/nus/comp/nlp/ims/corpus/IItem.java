/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.corpus;

/**
 * item interface. item is the basic unit in a sentence. For English, it is
 * always a word.
 *
 * @author zhongzhi
 *
 */
public interface IItem extends Cloneable {

	/**
	 * get the number of values in this item
	 * @return number of values
	 */
	public int size();

	/**
	 * get the value of p_Index
	 *
	 * @param p_Index
	 *            value index
	 * @return value
	 */
	public String get(int p_Index);

	/**
	 * set the value in p_Index
	 *
	 * @param p_Index
	 *            value index
	 * @param p_Value
	 *            value to set
	 * @return success or not
	 */
	public boolean set(int p_Index, String p_Value);

	/**
	 * clone
	 * @return clone
	 */
	public IItem clone();

}
