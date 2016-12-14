package com.javapatterns.strategy.my;

import java.util.Map;
import com.javapatterns.strategy.my.SyncMessServiceImpl.OperateMake;
/**
 * 
 * @author xwd
 *
 * @time 2016年12月14日 下午11:40:37
 */
public class MakeMess {
public static void main(String[]args){
	SyncMessServiceImpl syncMessService=new SyncMessServiceImpl();
	syncMessService.makeMess("test", "test", "test", "url",null,new OperateMake(){
		@Override
		public String operate(Map<String, Object> condition) {
			//产生不同业务模块的特定业务数据
			return "";
		}
	});
}
}
