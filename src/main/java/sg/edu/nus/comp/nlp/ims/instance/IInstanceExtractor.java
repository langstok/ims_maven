/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.instance;

import sg.edu.nus.comp.nlp.ims.corpus.ICorpus;
import sg.edu.nus.comp.nlp.ims.feature.IFeatureExtractor;

/**
 * instance extractor interface. cooperate with a feature extractor to extract
 * instances from corpus
 * 
 * @author zhongzhi
 * 
 */
public interface IInstanceExtractor {

	/**
	 * check whether has more instance remain
	 * 
	 * @return has or not
	 */
	public boolean hasNext();

	/**
	 * get the next instance
	 * 
	 * @return instance
	 */
	public IInstance next();

	/**
	 * set corpus to be extracted
	 * 
	 * @param p_Corpus
	 *            corpus to be extracted
	 * @return set success or not
	 */
	public boolean setCorpus(ICorpus p_Corpus);

	/**
	 * set featureExtractor to the InstanceExtractor
	 * 
	 * @param p_FeatureExtactor
	 *            feature extractor
	 * @return set success or not
	 */
	public boolean setFeatureExtractor(IFeatureExtractor p_FeatureExtactor);
}
