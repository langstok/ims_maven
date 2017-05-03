/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.lexelt;

/**
 * feature selector interface.
 *
 * @author zhongzhi
 *
 */
public interface IFeatureSelector {

	/**
	 * select type
	 * @author zhongzhi
	 *
	 */
	public enum Type {
		FILTER, PART, ACCEPT
	}

	/**
	 * filter statistic
	 *
	 * @param p_Stat
	 *            input statistic
	 */
	public void filter(IStatistic p_Stat);

	/**
	 * check whether p_FeatureIndex is filtered
	 *
	 * @param p_FeatureIndex
	 *            feature index
	 * @return filter type
	 */
	public Type isFiltered(int p_FeatureIndex);

	/**
	 * check whether p_FeatureIndex's p_Value is filtered
	 *
	 * @param p_FeatureIndex
	 *            feature index
	 * @param p_Value
	 *            feature value
	 * @return filter type
	 */
	public Type isFiltered(int p_FeatureIndex, String p_Value);
}
