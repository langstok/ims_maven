/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.lexelt;

/**
 * result information
 * @author zhongzhi
 *
 */
public class CResultInfo {
	// probabilities
	public double[][] probabilities;
	// classes
	public String[] classes;
	// lexelt
	public String lexelt;
	public String[] ids;
	public String[] docs;

	public CResultInfo() {

	}

	/**
	 * get number of instances
	 *
	 * @return number of instances
	 */
	public int size() {
		return this.ids.length;
//		return this.lexelt.size();
	}

	/**
	 * get number of classes
	 *
	 * @return number of classes
	 */
	public int numClasses() {
		return this.classes.length;
	}

	/**
	 * get the answer index for instance
	 *
	 * @param p_Instance
	 *            instance index
	 * @return answer index
	 */
	public int getAnswer(int p_Instance) {
		int max = -1;
		double maxValue = -1;
		for (int i = 0; i < probabilities[p_Instance].length; i++) {
			if (maxValue < probabilities[p_Instance][i]) {
				maxValue = probabilities[p_Instance][i];
				max = i;
			}
		}
		return max;
	}

	/**
	 * get instance id
	 *
	 * @param p_Instance
	 *            instance index
	 * @return instance id
	 */
	public String getID(int p_Instance) {
		return this.ids[p_Instance];
//		return this.lexelt.getInstanceID(p_Instance);
	}

	/**
	 * get lexelt id
	 * @return lexelt id
	 */
	public String getID() {
		return this.lexelt;
	}

	/**
	 * get instance document id
	 * @param p_Instance instance index
	 * @return document id
	 */
	public String getDocID(int p_Instance) {
		return this.docs[p_Instance];
	}
}