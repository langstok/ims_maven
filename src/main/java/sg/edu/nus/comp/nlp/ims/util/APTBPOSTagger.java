/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.util;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * POS tagger with Penn TreeBank POS tag set.
 *
 * @author zhongzhi
 *
 */
public abstract class APTBPOSTagger implements IPOSTagger {
	// pos tag set
	public static HashSet<String> POSSET = new HashSet<String>();
	// convert pos tag to short form
	public static Hashtable<String, String> POSSTANDARD = new Hashtable<String, String>();

	static {
		POSSTANDARD.put("JJ", "a");
		POSSTANDARD.put("JJR", "a");
		POSSTANDARD.put("JJS", "a");

		POSSTANDARD.put("NN", "n");
		POSSTANDARD.put("NNS", "n");
		POSSTANDARD.put("NNP", "n");
		POSSTANDARD.put("NNPS", "n");

		POSSTANDARD.put("RB", "r");
		POSSTANDARD.put("RBR", "r");
		POSSTANDARD.put("RBS", "r");
		POSSTANDARD.put("WRB", "r");

		POSSTANDARD.put("MD", "v");
		POSSTANDARD.put("VB", "v");
		POSSTANDARD.put("VBD", "v");
		POSSTANDARD.put("VBG", "v");
		POSSTANDARD.put("VBN", "v");
		POSSTANDARD.put("VBP", "v");
		POSSTANDARD.put("VBZ", "v");

		POSSET.add("CC");
		POSSET.add("CD");
		POSSET.add("DT");
		POSSET.add("EX");
		POSSET.add("FW");
		POSSET.add("IN");
		POSSET.add("JJ");
		POSSET.add("JJR");
		POSSET.add("JJS");
		POSSET.add("LS");
		POSSET.add("MD");
		POSSET.add("NN");
		POSSET.add("NNS");
		POSSET.add("NNP");
		POSSET.add("NNPS");
		POSSET.add("PDT");
		POSSET.add("POS");
		POSSET.add("PRP");
		POSSET.add("PRP$");
		POSSET.add("RB");
		POSSET.add("RBR");
		POSSET.add("RBS");
		POSSET.add("RP");
		POSSET.add("SYM");
		POSSET.add("TO");
		POSSET.add("UH");
		POSSET.add("VB");
		POSSET.add("VBD");
		POSSET.add("VBG");
		POSSET.add("VBN");
		POSSET.add("VBP");
		POSSET.add("VBZ");
		POSSET.add("WDT");
		POSSET.add("WP");
		POSSET.add("WP$");
		POSSET.add("WRB");
		POSSET.add("$");
		POSSET.add(",");
		POSSET.add("#");
		POSSET.add("``");
		POSSET.add("''");
		POSSET.add("(");
		POSSET.add(")");
		POSSET.add(".");
		POSSET.add(":");
	}

	/**
	 * get the short form of Penn TreeBank POS tags
	 * @param p_POS input Penn TreeBank POS tag
	 * @return POS short form
	 */
	public static String getShortForm(String p_POS) {
		String retVal = null;
		if (POSSTANDARD.containsKey(p_POS)) {
			retVal = POSSTANDARD.get(p_POS);
		}
		return retVal;
	}
}
