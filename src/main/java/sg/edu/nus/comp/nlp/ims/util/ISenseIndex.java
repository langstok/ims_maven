/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * sense index interface. refer to the index.sense file in wordnet.
 * 
 * @author zhongzhi
 * 
 */
public interface ISenseIndex {
	/**
	 * get the first sense of p_Lexelt
	 * 
	 * @param p_Lexelt
	 *            lexelt id
	 * @return first sense
	 */
	public String getFirstSense(String p_Lexelt);

	/**
	 * get sense number of p_Sense
	 * 
	 * @param p_Sense
	 *            sense
	 * @return sense number
	 */
	public int getSenseNo(String p_Sense);

}
