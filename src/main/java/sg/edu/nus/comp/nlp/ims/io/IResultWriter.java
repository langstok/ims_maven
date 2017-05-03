/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.io;

import java.io.IOException;

/**
 * result writer interface.
 *
 * @author zhongzhi
 *
 */
public interface IResultWriter {
	/**
	 * write results
	 *
	 * @param p_Result
	 *            result
	 * @throws IOException
	 *             exception while saving result
	 */
	public void write(Object p_Result) throws IOException;

	/**
	 * convert result to string
	 *
	 * @param p_Result
	 *            classification result
	 * @return string format
	 */
	public String toString(Object p_Result);

	/**
	 * set options
	 *
	 * @param p_Options
	 *            options
	 */
	public void setOptions(String[] p_Options);
}
