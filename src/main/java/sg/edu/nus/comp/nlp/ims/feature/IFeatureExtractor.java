/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.feature;

import sg.edu.nus.comp.nlp.ims.corpus.ICorpus;

/**
 * feature extractor interface. extract features from corpus.
 * 
 * @author zhongzhi
 * 
 */
public interface IFeatureExtractor {
	/**
	 * set the index of instance which to be extracted from corpus
	 * 
	 * @param p_Index
	 *            instance index
	 * @return set success or not
	 */
	public boolean setCurrentInstance(int p_Index);

	/**
	 * get the ID of current instance to be extracted
	 * 
	 * @return instance id
	 */
	public String getCurrentInstanceID();

	/**
	 * set corpus to be extracted
	 * 
	 * @param p_Corpus
	 *            corpus to be extracted
	 * @return set success or not
	 */
	public boolean setCorpus(ICorpus p_Corpus);

	/**
	 * restart the iterator
	 * 
	 * @return success or not
	 */
	public boolean restart();

	/**
	 * whether has at least one more feature
	 * 
	 * @return has or not
	 */
	public boolean hasNext();

	/**
	 * get the next feature
	 * 
	 * @return feature
	 */
	public IFeature next();

}
