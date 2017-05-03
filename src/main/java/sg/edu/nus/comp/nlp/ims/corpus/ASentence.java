/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.corpus;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * superclass of sentence.
 *
 * @author zhongzhi
 *
 */
public abstract class ASentence implements ISentence {
	// items in sentence
	protected ArrayList<IItem> m_Items = null;
	// sentence values
	protected Hashtable<String, String> m_Values = new Hashtable<String, String>();

	/**
	 * default constructor
	 */
	public ASentence() {
		this.m_Items = new ArrayList<IItem>();
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#clear()
	 */
	public void clear() {
		this.m_Items.clear();
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#getItem(int)
	 */
	public IItem getItem(int p_Index) {
		if (p_Index >= 0 && p_Index < this.m_Items.size()) {
			return this.m_Items.get(p_Index);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#get(java.lang.String)
	 */
	public String get(String p_Key) {
		return this.m_Values.get(p_Key);
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#set(java.lang.String, java.lang.String)
	 */
	public boolean set(String p_Key, String p_Value) {
		this.m_Values.put(p_Key, p_Value);
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.corpus.ISentence#size()
	 */
	public int size() {
		return this.m_Items.size();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String retVal = null;
		if (this.m_Items != null && this.m_Items.size() > 0) {
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < this.m_Items.size(); i++) {
				if (i != 0) {
					builder.append(" ");
				}
				builder.append(this.m_Items.get(i).toString());
			}
			retVal = builder.toString();
		}
		return retVal;
	}
}
