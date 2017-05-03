/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

/**
 * pos feature.
 *
 * @author zhongzhi
 *
 */
public class CPOSFeature extends AListFeature {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.AListFeature#clone()
	 */
	public Object clone() {
		CPOSFeature clone = new CPOSFeature();
		clone.m_Key = this.m_Key;
		clone.m_Value = this.m_Value;
		return clone;
	}
}
