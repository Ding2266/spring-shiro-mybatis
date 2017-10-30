package cn.mldn.mldnshiro.ssm.service.front;

import java.util.Map;
import java.util.Set;

import cn.mldn.mldnshiro.ssm.vo.Member;

public interface IMemberServiceFront {
	/**
	 * 根据用户ID 获得一个用户的完整信息
	 * @param mid 要查询的用户ID
	 * @return
	 */
	public Member get(String mid)  ;
	/**
	 * 根据指定的用户编号获得其对应的所有授权信息（角色，权限）
	 * @param mid 用户的ID
	 * @return 返回的信息里面包含有两类数据
	 * 1、key = allRoles 、value = 该用户具备的所有角色 ；
	 * 2、key = allAction 、value = 该用户具备的所有权限 ；
	 */
	public Map<String,Set<String>> getRoleAndAction(String mid) ; 
}
