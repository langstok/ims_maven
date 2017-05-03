/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

import java.util.ArrayList;

/**
 * a feature extractor combination for all-words tasks.
 *
 * @author zhongzhi
 *
 */
public class CAllWordsFeatureExtractorCombination extends CFeatureExtractorCombination {
	public CAllWordsFeatureExtractorCombination() {
		this.m_FeatureExtractors.clear();
		this.m_FeatureExtractors.add(new CPOSFeatureExtractor());
		this.m_FeatureExtractors.add(new CCollocationExtractor());
		this.m_FeatureExtractors.add(new CSurroundingWordExtractor(1, 1));
	}

	public CAllWordsFeatureExtractorCombination(
			ArrayList<IFeatureExtractor> p_FeatureExtractors) {
		super(p_FeatureExtractors);
	}
}
