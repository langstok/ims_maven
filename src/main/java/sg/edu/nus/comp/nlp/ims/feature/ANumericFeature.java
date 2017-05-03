/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

/**
 * feature type with numeral value.
 * @author zhongzhi
 *
 */
public abstract class ANumericFeature implements IFeature {

	protected String m_Key;

	/* (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#getKey()
	 */
	@Override
	public String getKey() {
		return this.m_Key;
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#setKey(java.lang.String)
	 */
	@Override
	public boolean setKey(String p_Key) {
		if (p_Key != null) {
			this.m_Key = p_Key;
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public abstract Object clone();
}
