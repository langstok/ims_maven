/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

/**
 * feature with a double figure as value.
 * @author zhongzhi
 *
 */
public class CDoubleFeature extends ANumericFeature {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	protected Double m_Value = Double.MAX_VALUE;

	/* (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.ANumeralFeature#clone()
	 */
	@Override
	public Object clone() {
		CDoubleFeature clone = new CDoubleFeature();
		clone.m_Key = this.m_Key;
		clone.m_Value = this.m_Value;
		return null;
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#getValue()
	 */
	@Override
	public String getValue() {
		return this.m_Value.toString();
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.feature.IFeature#setValue(java.lang.String)
	 */
	@Override
	public boolean setValue(String value) {
		try {
			this.m_Value = Double.parseDouble(value);
		} catch (NumberFormatException ex) {
			throw new IllegalArgumentException(ex.getMessage());
		}
		return true;
	}

}
