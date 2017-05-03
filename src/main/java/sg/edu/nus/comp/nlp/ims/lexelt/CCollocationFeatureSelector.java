/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.lexelt;

import sg.edu.nus.comp.nlp.ims.feature.CCollocation;

/**
 * collocation feature selector.
 *
 * @author zhongzhi
 *
 */
public class CCollocationFeatureSelector extends AListFeatureSelector {
	/**
	 * constructor
	 *
	 * @param p_M2
	 *            cut off
	 */
	public CCollocationFeatureSelector(int p_M2) {
		this.m_M2 = p_M2;
		this.m_FeatureName = CCollocation.class.getName();
	}

}
