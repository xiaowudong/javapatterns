package com.javapatterns.strategy.my;

import java.util.Map;
/**
 * 
 * @author xwd
 *
 * @time 2016年12月14日 下午11:32:44
 */
public class SyncMessServiceImpl {
	public  void makeMess(String messKey,String messType,String messTo,String url,Map<String,Object> condition,OperateMake om){
		om.operate(condition);
		//dosomething
	}
	/**
	 * 生产不同业务的同步信息
	 * @author xiaowudong
	 * @time   2016年12月14日 下午11:32:44
	 *
	 */
	public static abstract  class OperateMake{
		/**
		 * 
		 * @param condition
		 * @return null  产生失败
		 */
		public abstract String operate(Map<String,Object> condition);
	}
}
