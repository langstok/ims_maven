/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.classifiers;

import sg.edu.nus.comp.nlp.ims.util.ISenseIndex;

/**
 * evaluator interface.
 * 
 * @author zhongzhi
 * 
 */
public interface IEvaluator {
	/**
	 * evaluate p_Lexelt
	 * 
	 * @param p_Lexelt
	 *            lexelt
	 * @return evaluation result
	 * @throws Exception
	 *             evaluation exception
	 */
	public Object evaluate(Object p_Lexelt) throws Exception;

	/**
	 * set sense index
	 * 
	 * @param p_SenseIndex
	 *            sense index
	 */
	public void setSenseIndex(ISenseIndex p_SenseIndex);

	/**
	 * set options
	 * 
	 * @param p_Options
	 *            options
	 */
	public void setOptions(String[] p_Options);
}
