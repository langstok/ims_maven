/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPOutputStream;

import opennlp.maxent.GISModel;
import opennlp.maxent.io.ObjectGISModelWriter;

import sg.edu.nus.comp.nlp.ims.lexelt.CModelInfo;
import sg.edu.nus.comp.nlp.ims.lexelt.IStatistic;
import sg.edu.nus.comp.nlp.ims.util.CArgumentManager;

/**
 * save model to hard disk.
 *
 * @author zhongzhi
 *
 */
public class CModelWriter implements IModelWriter {

	// model directory
	protected String m_ModelDir;
	// statistic directory
	protected String m_StatisticDir;

	/**
	 * default constructor
	 */
	public CModelWriter() {
		this(".");
	}

	/**
	 * constructor with model directory
	 *
	 * @param p_ModelDir
	 *            model directory
	 */
	public CModelWriter(String p_ModelDir) {
		this(p_ModelDir, p_ModelDir);
	}

	/**
	 * constructor with model directory and statistic directory
	 *
	 * @param p_ModelDir
	 *            model directory
	 * @param p_StatisticDir
	 *            statistic directory
	 */
	public CModelWriter(String p_ModelDir, String p_StatisticDir) {
		this.m_ModelDir = p_ModelDir;
		this.m_StatisticDir = p_StatisticDir;
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.io.IModelWriter#write(java.lang.Object)
	 */
	@Override
	public void write(Object p_Model) throws IOException {
		CModelInfo info = (CModelInfo) p_Model;
		((IStatistic) info.statistic).writeToFile(this.m_StatisticDir + "/" + info.lexelt
				+ ".stat.gz");
		if (info.model != null) {
			ObjectOutputStream oos = new ObjectOutputStream(
					new GZIPOutputStream(new FileOutputStream(this.m_ModelDir
							+ "/" + info.lexelt + ".model.gz")));
			if (GISModel.class.isInstance(info.model)) {
				ObjectGISModelWriter writer = new ObjectGISModelWriter((GISModel) info.model, oos);
				writer.persist();
			} else {
				oos.writeObject(info.model);
				oos.flush();
				oos.close();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.io.IModelWriter#setOptions(java.lang.String[])
	 */
	@Override
	public void setOptions(String[] p_Options) {
		CArgumentManager argmgr = new CArgumentManager(p_Options);
		if (argmgr.has("m")) {
			this.m_ModelDir = argmgr.get("m");
			this.m_StatisticDir = this.m_ModelDir;
		}
		if (argmgr.has("s")) {
			this.m_StatisticDir = argmgr.get("s");
		}
	}

}
