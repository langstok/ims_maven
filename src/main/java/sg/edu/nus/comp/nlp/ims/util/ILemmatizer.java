/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * lemmatizer interface.
 *
 * @author zhongzhi
 *
 */
public interface ILemmatizer {
	/**
	 * lemmatize the input
	 * @param p_Input input information
	 * @return lemma
	 */
	public String lemmatize(String[] p_Input);

	/**
	 * guess lexelt of input
	 * @param p_Input input
	 * @return lexelt
	 */
	public String guessLexelt(String[] p_Input);

	/**
	 * get the lexelt of input
	 * @param p_Input input
	 * @return lexelt
	 */
	public String getLexelt(String[] p_Input);
}
