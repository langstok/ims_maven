/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

import java.io.File;
import java.io.IOException;

import opennlp.maxent.MaxentModel;
import opennlp.maxent.io.SuffixSensitiveGISModelReader;
import opennlp.tools.tokenize.TokenizerME;

/**
 * opennlp tokenizer.
 *
 * @author zhongzhi
 *
 */
public final class COpenNLPTokenizer implements ITokenizer {

	/**
	 * default tokenization model
	 */
	private static MaxentModel MODEL = null;

	/**
	 * set default tokenization model
	 *
	 * @param p_Model
	 *            model
	 */
	public static void setModel(MaxentModel p_Model) {
		MODEL = p_Model;
	}

	/**
	 * constructor
	 */
	public COpenNLPTokenizer() {
		this(MODEL);
	}

	/**
	 * constructor
	 * @param p_Model model
	 */
	public COpenNLPTokenizer(MaxentModel p_Model) {
		this.m_Model = p_Model;
	}

	/**
	 * constructor
	 * @param p_FileName model file
	 * @throws IOException exception while reading model
	 */
	public COpenNLPTokenizer(String p_FileName) throws IOException {
		this(new SuffixSensitiveGISModelReader(new File(p_FileName)).getModel());
	}

	/**
	 * maxent model for tokenization
	 */
	private MaxentModel m_Model = null;

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.util.ITokenizer#tokenize(java.lang.String)
	 */
	public String[] tokenize(String p_Sentence) {
		TokenizerME tokenizer = new TokenizerME(this.m_Model);
		return tokenizer.tokenize(p_Sentence);
	}

	/**
	 * tokenize with default model
	 *
	 * @param p_Sentence
	 *            input sentence
	 * @return tokens
	 */
	public static String[] tokenizeWithDefault(String p_Sentence) {
		TokenizerME tokenizer = new TokenizerME(MODEL);
		return tokenizer.tokenize(p_Sentence);
	}
}
