/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * sentence tokenizer interface.
 * 
 * @author zhongzhi
 * 
 */
public interface ITokenizer {

	/**
	 * tokenize an input sentence into tokens
	 * 
	 * @param input
	 *            input sentence
	 * @return tokens
	 */
	public String[] tokenize(String input);
}
