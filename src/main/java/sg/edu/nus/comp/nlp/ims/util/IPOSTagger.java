/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * POS tagger interface.
 *
 * @author zhongzhi
 *
 */
public interface IPOSTagger {
	/**
	 * tag a tokenized input sentence
	 *
	 * @param input
	 *            a tokenized sentence
	 * @return sentence with tag for each token
	 */
	public String tag(String input);

	/**
	 * get the tag of a tagged token
	 *
	 * @param input
	 *            a tagged token
	 * @return tag
	 */
	public String getTag(String input);

	/**
	 * get the original token of a tagged token
	 *
	 * @param input
	 *            a tagged token
	 * @return original token
	 */
	public String getToken(String input);

}
