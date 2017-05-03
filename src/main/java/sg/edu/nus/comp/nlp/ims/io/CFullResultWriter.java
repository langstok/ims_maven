/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import sg.edu.nus.comp.nlp.ims.lexelt.CResultInfo;

/**
 * write the result with probabilities to disk.
 *
 * @author zhongzhi
 *
 */
public class CFullResultWriter extends CResultWriter {

	/**
	 * default constructor
	 */
	public CFullResultWriter() {
		this(".");
	}

	/**
	 * constructor with save directory
	 *
	 * @param p_SaveDir
	 *            save directory
	 */
	public CFullResultWriter(String p_SaveDir) {
		super(p_SaveDir);
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.io.CResultWriter#write(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void write(Object p_Result) throws IOException {
		if (List.class.isInstance(p_Result)) {
			for (Object obj : (List<Object>) p_Result) {
				this.write(obj);
			}
			return;
		}
		CResultInfo info = (CResultInfo) p_Result;
		String savePath = this.getFile(info.getID());
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(savePath)));
		for (int instIdx = 0; instIdx < info.size(); instIdx++) {
			String docID = info.getDocID(instIdx);
			String id = info.getID(instIdx);
			if (docID == null) {
				docID = "";
			}
			writer.write(docID);
			writer.write(" ");
			writer.write(id);
			for (int i = 0; i < info.probabilities[instIdx].length; i++) {
				writer.write(" ");
				writer.write(info.classes[i]);
				writer.write(" ");
				writer.write(Double.toString(info.probabilities[instIdx][i]));
			}
			writer.write("\n");
		}
		writer.flush();
		writer.close();
	}

	/*
	 * (non-Javadoc)
	 * @see sg.edu.nus.comp.nlp.ims.io.CResultWriter#toString(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public String toString(Object p_Result) {
		if (List.class.isInstance(p_Result)) {
			StringBuilder builder = new StringBuilder();
			for (Object obj : (List<Object>) p_Result) {
				builder.append(this.toString(obj));
			}
			return builder.toString();
		}
		CResultInfo info = (CResultInfo) p_Result;
		StringBuilder builder = new StringBuilder();
		for (int instIdx = 0; instIdx < info.size(); instIdx++) {
			String docID = info.getDocID(instIdx);
			String id = info.getID(instIdx);
			if (docID == null) {
				docID = "";
			}
			builder.append(docID);
			builder.append(" ");
			builder.append(id);
			for (int i = 0; i < info.probabilities[instIdx].length; i++) {
				builder.append(" ");
				builder.append(info.classes[i]);
				builder.append(" ");
				builder.append(Double.toString(info.probabilities[instIdx][i]));
			}
			builder.append("\n");
		}
		return builder.toString();
	}

}
