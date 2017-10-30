package cn.mldn.mldnshiro.ssm.service.back;

import java.util.List;

import cn.mldn.mldnshiro.ssm.vo.Dept;

public interface IDeptServiceBack {
	/**
	 * 增加新部门数据
	 * @param vo  部门信息
	 * @return
	 */
	public boolean add(Dept vo) ; 
	/**
	 * 获取全部部门信息
	 * @return 所有的部门信息，如果没有内容则集合长度为0,返回不为null
	 */
	public List<Dept> list() ; 
	/**
	 * 根据部门编号执行部门的数据删除操作
	 * @param deptno 部门编号
	 * @return
	 */
	public boolean remove(long deptno) ; 
}
