/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

/**
 * pair template
 * @author zhongzhi
 *
 */
public class CPair <F, S> {
	// first value
	protected F m_First;
	// second value
	protected S m_Second;

	/**
	 * constructor
	 * @param p_First first value
	 * @param p_Second second value
	 */
	public CPair(F p_First, S p_Second) {
		m_First = p_First;
		m_Second = p_Second;
	}

	/**
	 * get first value
	 * @return first
	 */
	public F getFirst() {
		return m_First;
	}

	/**
	 * get second value
	 * @return second
	 */
	public S getSecond() {
		return m_Second;
	}

}
