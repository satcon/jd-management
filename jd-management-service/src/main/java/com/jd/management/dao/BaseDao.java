package com.jd.management.dao;

import org.apache.ibatis.session.SqlSession;

public class BaseDao {
	protected SqlSession sqlSession;
	private static final String SQLID_SEPARATOR = "."; // namespace中连接类全名和sqlId的分隔符
	
	protected String getSqlId(String sqlId) {
		return getSqlId(this.getClass(), sqlId);
	}
	
	protected static <T> String getSqlId(Class<T> clazz,String sqlId){
		if(clazz==null || sqlId == null){
			return null;
		}
		return clazz.getName() +  SQLID_SEPARATOR + sqlId;
	}

	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
}
