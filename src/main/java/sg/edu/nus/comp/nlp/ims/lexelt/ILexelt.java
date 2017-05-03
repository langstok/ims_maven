/**
 * IMS (It Makes Sense) -- NUS WSD System
 * Copyright (c) 2010 National University of Singapore.
 * All Rights Reserved.
 */
package sg.edu.nus.comp.nlp.ims.lexelt;

import java.io.Serializable;
import java.util.ArrayList;

import sg.edu.nus.comp.nlp.ims.instance.IInstance;

/**
 * lexelt interface. contains instances of the same lexelt id.
 * 
 * @author zhongzhi
 * 
 */
public interface ILexelt extends Serializable {
	/**
	 * add one instance into Lexelt. if p_AddToStat is true, the instance
	 * information will also be added to the statistic information
	 * 
	 * @param p_iInstance
	 *            instance
	 * @param p_AddToStat
	 *            add to statistic or not
	 * @return success or not
	 */
	public boolean addInstance(IInstance p_iInstance, boolean p_AddToStat);

	/**
	 * the same as addInstance(p_iInstance, false)
	 * 
	 * @param p_iInstance
	 *            instance
	 * @return add success or not
	 */
	public boolean addInstance(IInstance p_iInstance);

	/**
	 * remove the instance of index p_Index. whether the information of this
	 * instance will be removed from the statistic is according to the
	 * implementation.
	 * 
	 * @param p_Index
	 *            instance index
	 * @return removed instance
	 */
	public IInstance removeInstance(int p_Index);

	/**
	 * remove the instance of index p_Index. whether the information of this
	 * instance will be removed from the statistic is according to the
	 * implementation
	 * 
	 * @param p_InstanceID
	 *            instance id
	 * @return removed instance
	 */
	public IInstance removeInstance(String p_InstanceID);

	/**
	 * get the statistic information of this lexelt
	 * 
	 * @return the statistic information
	 */
	public IStatistic getStatistic();

	/**
	 * set the statistic information to the lexelt
	 * 
	 * @param p_iStatistic
	 *            statistic information
	 * @return success or not
	 */
	public boolean setStatistic(IStatistic p_iStatistic);

	/**
	 * get the instance id list of all the instances in Lexelt
	 * 
	 * @return instance id list
	 */
	public ArrayList<String> getInstanceIDs();

	/**
	 * get the ID of this lexelt
	 * 
	 * @return lexelt ID
	 */
	public String getID();

	/**
	 * get the tags of instance
	 * 
	 * @param p_Index
	 *            instance index
	 * @return instance tags
	 */
	public ArrayList<String> getTag(int p_Index);

	/**
	 * get the tag of p_InstanceID
	 * 
	 * @param p_InstanceID
	 *            instance id
	 * @return instance tags
	 */
	public ArrayList<String> getTag(String p_InstanceID);

	/**
	 * get the number of instances in lexelt
	 * 
	 * @return size
	 */
	public int size();

	/**
	 * get the instance id of instance p_Index
	 * 
	 * @param p_Index
	 *            instance id
	 * @return instance id
	 */
	public String getInstanceID(int p_Index);

	/**
	 * get the document id of instance p_Index
	 * 
	 * @param p_Index
	 *            instance id
	 * @return doc id
	 */
	public String getInstanceDocID(int p_Index);

	/**
	 * get the p_Key's value of instance p_InstanceID
	 * 
	 * @param p_InstanceID
	 *            instance id
	 * @param p_Key
	 *            feature name
	 * @return feature value
	 */
	public String getValue(String p_InstanceID, String p_Key);

	/**
	 * get the p_Key's value of instance p_Index
	 * 
	 * @param p_Index
	 *            instance index
	 * @param p_Key
	 *            feature name
	 * @return feature value
	 */
	public String getValue(int p_Index, String p_Key);

	/**
	 * get the p_Key's value of instance p_Index
	 * 
	 * @param p_Index
	 *            instance index
	 * @param p_KeyIndex
	 *            feature index
	 * @return feature value
	 */
	public String getValue(int p_Index, int p_KeyIndex);

	/**
	 * get instance with index p_Index
	 * 
	 * @param p_Index
	 *            instance index
	 * @return instance
	 */
	public IInstance getInstance(int p_Index);
}
