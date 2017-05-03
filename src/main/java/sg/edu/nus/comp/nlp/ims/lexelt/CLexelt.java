/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.lexelt;

import sg.edu.nus.comp.nlp.ims.instance.IInstance;

/**
 * a common lexelt.
 *
 * @author zhongzhi
 *
 */
public class CLexelt extends ALexelt {

	/**
	 * serial version id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * constructor with lexelt id
	 *
	 * @param p_LexeltID
	 *            lexelt id
	 */
	public CLexelt(String p_LexeltID) {
		super(p_LexeltID);
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.lexelt.ILexelt#addInstance(sg.edu.nus.comp.nlp.ims.instance.IInstance, boolean)
	 */
	public boolean addInstance(IInstance p_iInstance, boolean p_AddToStat) {
		synchronized (this) {
			if (p_iInstance != null) {
				String id = p_iInstance.getID();
				if (id != null && !id.isEmpty()) {
					this.m_IDs.add(id);
					this.m_Instances.add(p_iInstance);
					if (p_AddToStat) {
						this.m_Statistic.addInstance(p_iInstance);
					}
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * remove instance from lexelt no action will be done to the statistic of
	 * this lexelt
	 *
	 * @param p_Index
	 *            index
	 * @return removed instance
	 */
	@Override
	public IInstance removeInstance(int p_Index) {
		synchronized (this) {
			if (p_Index < this.m_Instances.size()) {
				this.m_IDs.remove(p_Index);
				return this.m_Instances.remove(p_Index);
			} else {
				throw new IndexOutOfBoundsException("index " + p_Index
						+ " is out of boundary(0 to " + this.m_Instances.size()
						+ ").");
			}
		}
	}

}
