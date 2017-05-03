/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

/**
 * surrounding word feature.
 *
 * @author zhongzhi
 *
 */
public class CSurroundingWord extends ABinaryFeature {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructor
	 */
	public CSurroundingWord() {
		this.m_Key = null;
		this.m_Value = true;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.ABinaryFeature#clone()
	 */
	public Object clone() {
		CSurroundingWord clone = new CSurroundingWord();
		clone.m_Key = this.m_Key;
		return clone;
	}
}
