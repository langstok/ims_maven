/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.corpus;

import java.util.ArrayList;

/**
 * abstract item.
 *
 * @author zhongzhi
 *
 */
public abstract class AItem implements IItem {

	/**
	 * feature types in item
	 * @author zhongzhi
	 *
	 */
	public enum Features {
		TOKEN, LEMMA, POS
	}

	// values of the item
	protected ArrayList<String> m_Values = new ArrayList<String>();

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.IItem#size()
	 */
	public int size() {
		return this.m_Values.size();
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.IItem#set(int, java.lang.String)
	 */
	public boolean set(int p_Index, String p_Value) {
		if (p_Index >= 0 && p_Index < this.m_Values.size()) {
			if (p_Value != null) {
				p_Value = p_Value.trim();
			}
			this.m_Values.set(p_Index, p_Value);
			return true;
		}
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.IItem#get(int)
	 */
	public String get(int p_Index) {
		if (p_Index >= 0 && p_Index < this.m_Values.size()) {
			return this.m_Values.get(p_Index);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < this.m_Values.size(); i++) {
			if (i != 0) {
				builder.append("/");
			}
			builder.append(this.m_Values.get(i));
		}
		return builder.toString();
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public abstract IItem clone();
}
