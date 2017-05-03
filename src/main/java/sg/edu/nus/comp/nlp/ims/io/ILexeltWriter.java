/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.io;

import sg.edu.nus.comp.nlp.ims.lexelt.ILexelt;

/**
 * lexelt writer interface. convert the instances in a lexelt to a special
 * format.
 *
 * @author zhongzhi
 *
 */
public interface ILexeltWriter {
	/**
	 * write information of p_iLexelt to p_FileName in some format
	 *
	 * @param p_Filename
	 *            file name
	 * @param p_Lexelt
	 *            lexelt
	 * @throws Exception exception while converting p_Lexelt
	 */
	public void write(String p_Filename, ILexelt p_Lexelt) throws Exception;

	/**
	 * write lexelt to a string
	 *
	 * @param p_Lexelt
	 *            lexelt
	 * @return feature vector string
	 * @throws Exception exception while converting p_Lexelt
	 */
	public String toString(ILexelt p_Lexelt) throws Exception;

	/**
	 * extract instances from p_iLexelt
	 *
	 * @param p_Lexelt
	 *            lexelt
	 * @return instances
	 * @throws Exception exception while converting p_Lexelt
	 */
	public Object getInstances(ILexelt p_Lexelt) throws Exception;
}
