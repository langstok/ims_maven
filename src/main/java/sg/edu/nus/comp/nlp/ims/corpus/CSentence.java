/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.corpus;

/**
 * common sentence conducted with CItems.
 *
 * @author zhongzhi
 *
 */
public class CSentence extends ASentence {

	/**
	 * default constructor
	 */
	public CSentence() {
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#appendItem(sg.edu.nus.comp.nlp.ims.corpus.IItem)
	 */
	public boolean appendItem(IItem p_Item) {
		if (p_Item != null) {
			return this.m_Items.add(p_Item);
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Object clone() {
		CSentence clone = new CSentence();
		for (IItem item : this.m_Items) {
			clone.appendItem((IItem) item.clone());
		}
		return clone;
	}

}
