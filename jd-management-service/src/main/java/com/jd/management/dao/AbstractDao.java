/**
 * 
 */
package com.jd.management.dao;

import org.apache.ibatis.session.SqlSession;

/**
 * @author Administrator
 *
 */
public class AbstractDao<T> {
	
	private SqlSession sqlSession;
	
	private static final String SQLID_SEPARATOR = "."; // namespace中连接类全名和sqlId的分隔符
	
	
	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	public T getById(long id) {
		return getSqlSession().selectOne(this.getSqlId("getById"), id);
	}
	
	/**
	 * 插入
	 * @param t
	 * @return
	 */
	public Integer insert(T t) {
		return getSqlSession().insert(this.getSqlId("insert"), t);
	}
	
	/**
	 * 更新
	 * @param user
	 */
	public Integer update(T t) {
		return getSqlSession().update(this.getSqlId("update"), t);
	}
	/**
	 * 删除
	 * @param id
	 */
	public Integer deleteById(Long id) {
		return getSqlSession().update(this.getSqlId("deleteById"), id);
	}
	
	protected String getSqlId(String sqlId) {
		return getSqlId(this.getClass(), sqlId);
	}
	
	protected static <T> String getSqlId(Class<T> clazz,String sqlId){
		if(clazz==null || sqlId == null){
			return null;
		}
		return clazz.getName() +  SQLID_SEPARATOR + sqlId;
	}
	
	

	/**
	 * @return the sqlSession
	 */
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	/**
	 * @param sqlSession the sqlSession to set
	 */
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

}
