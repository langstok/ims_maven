/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.classifiers;

/**
 * interface to train a model for a given lexelt.
 * 
 * @author zhongzhi
 * 
 */
public interface IModelTrainer {
	/**
	 * train a model with instances in p_Lexelt
	 * 
	 * @param p_Lexelt
	 *            lexelt
	 * @return model
	 * @throws Exception
	 *             train exception
	 */
	public Object train(Object p_Lexelt) throws Exception;

	/**
	 * set options
	 * 
	 * @param p_Options
	 *            options
	 */
	public void setOptions(String[] p_Options);
}
