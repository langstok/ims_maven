/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.corpus;

/**
 * common item in a sentence.
 *
 * @author zhongzhi
 *
 */
public class CItem extends AItem {

	/**
	 * default constructor
	 */
	public CItem() {
		for (int i = Features.values().length - 1; i >= 0; i--) {
			this.m_Values.add(null);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.AItem#clone()
	 */
	public IItem clone() {
		CItem clone = new CItem();
		for (String value : this.m_Values) {
			clone.m_Values.add(value);
		}
		return clone;
	}

}
