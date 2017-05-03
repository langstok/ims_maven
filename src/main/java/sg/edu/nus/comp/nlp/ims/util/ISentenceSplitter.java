/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * sentence splitter interface.
 * 
 * @author zhongzhi
 * 
 */
public interface ISentenceSplitter {
	/**
	 * split input into sentences
	 * 
	 * @param input
	 *            input string
	 * @return sentences
	 */
	public String[] split(String input);
}
