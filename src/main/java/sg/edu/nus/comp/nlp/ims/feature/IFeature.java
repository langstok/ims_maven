/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

import java.io.Serializable;

/**
 * feature interface.
 *
 * @author zhongzhi
 *
 */
public interface IFeature extends Cloneable, Serializable {

	/**
	 * set feature value
	 *
	 * @param p_Value
	 *            feature value
	 * @return success or not
	 */
	public boolean setValue(String p_Value);

	/**
	 * get feature value
	 *
	 * @return value
	 */
	public String getValue();

	/**
	 * set feature key
	 *
	 * @param p_Key
	 *            feature key
	 * @return success or not
	 */
	public boolean setKey(String p_Key);

	/**
	 * get feature key
	 *
	 * @return feature key
	 */
	public String getKey();

	/**
	 * clone this feature
	 *
	 * @return clone feature
	 */
	public Object clone();
}
