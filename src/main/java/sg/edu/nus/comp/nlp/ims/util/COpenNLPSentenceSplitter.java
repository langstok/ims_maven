/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

import java.io.File;
import java.io.IOException;

import opennlp.maxent.GISModel;
import opennlp.maxent.MaxentModel;
import opennlp.maxent.io.SuffixSensitiveGISModelReader;
import opennlp.tools.sentdetect.SentenceDetectorME;

/**
 * opennlp sentence splitter.
 *
 * @author zhongzhi
 *
 */
public final class COpenNLPSentenceSplitter implements ISentenceSplitter {

	/**
	 * default sentence splitter model
	 */
	private static MaxentModel MODEL = null;

	/**
	 * set default sentence splitter model
	 *
	 * @param p_Model
	 *            model
	 */
	public static void setDefaultModel(MaxentModel p_Model) {
		MODEL = p_Model;
	}

	/**
	 * set default sentence splitter model
	 *
	 * @param p_FileName
	 *            Model file
	 * @throws IOException
	 *             exception while reading model
	 */
	public static void setDefaultModel(String p_FileName) throws IOException {
		setDefaultModel(new File(p_FileName));
	}

	/**
	 * set default sentence splitter model
	 *
	 * @param p_File
	 *            Model file
	 * @throws IOException
	 *             exception while reading model
	 */
	public static void setDefaultModel(File p_File) throws IOException {
		setDefaultModel(getGISModel(p_File));
	}

	/**
	 * Maxent Model for sentence split
	 */
	private MaxentModel m_Model = null;

	/**
	 * constructor
	 */
	public COpenNLPSentenceSplitter() {
		this(MODEL);
	}

	/**
	 * constructor
	 * @param p_File model file
	 * @throws IOException exception while reading model
	 */
	public COpenNLPSentenceSplitter(File p_File) throws IOException {
		this(getGISModel(p_File));
	}

	/**
	 * constructor
	 * @param p_FileName model file
	 * @throws IOException exception while reading model
	 */
	public COpenNLPSentenceSplitter(String p_FileName) throws IOException {
		this(new File(p_FileName));
	}

	/**
	 * constructor
	 * @param p_Model model
	 */
	public COpenNLPSentenceSplitter(MaxentModel p_Model) {
		this.m_Model = p_Model;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.util.ISentenceSplitter#split(java.lang.String)
	 */
	public String[] split(String p_Data) {
		if (this.m_Model == null) {
			throw new IllegalStateException("opennlp splitter model is not set.");
		}
		if (p_Data == null || p_Data.isEmpty()) {
			return new String[0];
		}
		SentenceDetectorME sdme = new SentenceDetectorME(this.m_Model);
		return sdme.sentDetect(p_Data);
	}

	/**
	 * get GISModel from file
	 *
	 * @param p_File
	 *            model file
	 * @return GISModel
	 * @throws IOException
	 *             exception while reading model
	 */
	private static GISModel getGISModel(File p_File) throws IOException {
		return new SuffixSensitiveGISModelReader(p_File).getModel();
	}

}
