package com.kh.mybatis.emp.model.service;

import static com.kh.mybatis.common.MybatisUtils.getSqlSession;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.emp.model.dao.EmpDao;
import com.kh.mybatis.emp.model.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService {

	private EmpDao empDao = new EmpDaoImpl();
	
	@Override
	public List<Map<String, Object>> selectAllEmp() {
		SqlSession session = getSqlSession();
		List<Map<String, Object>> list = empDao.selectAllEmp(session);
		session.close();
		return list;
	}

	@Override
	public List<Map<String, Object>> search1(Map<String, Object> param) {
		SqlSession session = getSqlSession();
		List<Map<String, Object>> list = empDao.search1(session, param);
		session.close();
		return list;
	}

	@Override
	public List<Map<String, Object>> search2(Map<String, Object> param) {
		//import static com.kh.mybatis.common.MybatisUtils.getSqlSession; 중요 
		SqlSession session =getSqlSession();
		
		List<Map<String, Object>> list = empDao.search2(session, param);
		session.close();
		return list;
	}

	@Override
	public List<Map<String, String>> selectJobList() {
		SqlSession session =getSqlSession();
		List<Map<String, String>> joblist =empDao.selectJobList(session);
		return joblist;
	}

	@Override
	public List<Map<String, Object>> search3(Map<String, Object> param) {
		//import static com.kh.mybatis.common.MybatisUtils.getSqlSession; 중요 
				SqlSession session =getSqlSession();
				
				List<Map<String, Object>> list = empDao.search3(session, param);
				session.close();
				return list;

	}

	@Override
	public List<Map<String, String>> selectDeptList() {
		SqlSession session =getSqlSession();
		List<Map<String, String>> deptlist =empDao.selectDeptList(session);
		return deptlist;
	}

	@Override
	public Map<String, Object> selectOneEmp(String empId) {
		SqlSession session = getSqlSession();
		Map<String, Object>emp = empDao.selectOneEmp(session,empId);
		session.close();
		return emp;
	}


	@Override
	public int updateEmp(Map<String, String> param) {
		SqlSession session = getSqlSession();
		int result = 0;
		try {
			result = empDao.updateEmp(session, param);
			session.commit();
		} catch(Exception e) {
			session.rollback();
			throw e;
		} finally {
			session.close();
		}
		
		return result;
	}
	
	

	
	
}