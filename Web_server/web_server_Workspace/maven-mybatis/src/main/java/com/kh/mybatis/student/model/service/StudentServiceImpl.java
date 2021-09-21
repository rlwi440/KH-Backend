package com.kh.mybatis.student.model.service;

import static com.kh.mybatis.common.MybatisUtils.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.MybatisUtils;
import com.kh.mybatis.student.model.dao.StudentDao;
import com.kh.mybatis.student.model.dao.StudentDaoImpl;
import com.kh.mybatis.student.model.vo.Student;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao =new StudentDaoImpl();

	@Override
	public int insertStudent(Student student) {
		//1.SqlSession생성
		//import static com.kh.mybatis.common.MybatisUtils.getSqlSession;    MybatisUtils 스킵 
		SqlSession session =getSqlSession();
		int result=0;
		try {

		//2.dao 업무위임
		result=studentDao.insertStudent(session,student);
		//3.transaction처리 :SqlSession 에 대해서 commit|rollback 
		session.commit();
		}catch (Exception e) {
			session.rollback();
			throw e;
		}finally {
			//4. SqlSession자원반납
			session.close();
		}
	
		return result;
	}

	@Override
	public int insertStudentMap(Map<String, Object> student) {
		int result =0;
		SqlSession session =getSqlSession();
		try {
			//2.dao 업무위임
		result= studentDao.insertStudentMap(session,student);
		//3.transaction처리 :SqlSession 에 대해서 commit|rollback 
		session.commit();
		}catch (Exception e) {
			session.rollback();
			throw e;
		}finally {
			//4. SqlSession자원반납
			session.close();
		}
		return result;
	}

	@Override
	public int selectStudentCount() {
	 SqlSession session= getSqlSession();
	 int total= studentDao.selectStudentCount(session);
	 //Sqlsession자원반납
	 	session.close();
		return total;
	}

	@Override
	public Student selectOneStudent(int no) {
		SqlSession session =getSqlSession();
		Student student = studentDao.selectOneStudent(session,no);
		session.close();
		return student;
	}

	@Override
	public Map<String, Object> selectOneStudentMap(int no) {
		SqlSession session = getSqlSession();
		Map<String, Object> student = studentDao.selectOneStudentMap(session, no);
		session.close();
		return student;
	}

	@Override
	public int updateStudent(Student student) {
		int result = 0;
		SqlSession session = getSqlSession();
		try {
			result = studentDao.updateStudent(session, student);
			session.commit();
		} catch(Exception e) {
			session.rollback();
			throw e;
		} finally {
			session.close();
		}
		return result;
	}

	@Override
	public int deleteStudent(int no) {
		int result = 0;
		SqlSession session = getSqlSession();
		try {
			result = studentDao.deleteStudent(session, no);
			session.commit();
		} catch(Exception e) {
			session.rollback();
			throw e;
		} finally {
			session.close();
		}
		return result;
	}
	//DQL 방식
	@Override
	public List<Student> selectStudentList() {
		SqlSession session =getSqlSession();
		List<Student>list =studentDao.selectStudentList(session);
		session.close();
		return list;
	}

	@Override
	public List<Map<String, Object>> selectStudentMapList() {
		SqlSession session =getSqlSession();
		List<Map<String, Object>> list =studentDao.selectStudentMapList(session);
		session.close();
		return list;
	}
	
}