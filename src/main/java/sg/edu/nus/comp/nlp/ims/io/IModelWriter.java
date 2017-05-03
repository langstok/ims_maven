/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.io;

import java.io.IOException;

/**
 * model writer interface.
 * 
 * @author zhongzhi
 * 
 */
public interface IModelWriter {

	/**
	 * write model
	 * 
	 * @param p_ModelInfo
	 *            model
	 * @throws IOException
	 *             exception while saving model
	 */
	public void write(Object p_ModelInfo) throws IOException;

	/**
	 * set options
	 * 
	 * @param p_Options
	 *            options
	 */
	public void setOptions(String[] p_Options);
}
