package com.kh.mybatis.student.model.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.student.model.vo.Student;

public class StudentDaoImpl implements StudentDao {

	@Override
	public int insertStudent(SqlSession session, Student student) {
		// statement : namespace.queryTagId
		return session.insert("student.insertStudent", student);
	}

	@Override
	public int insertStudentMap(SqlSession session, Map<String, Object> student) {
		// TODO Auto-generated method stub
		return session.insert("student.insertStudentMap",student);
	}

	@Override
	public int selectStudentCount(SqlSession session) {
		// TODO Auto-generated method stub
		return  session.selectOne("student.selectStudentCount");
	}

	@Override
	public Student selectOneStudent(SqlSession session, int no) {
		return session.selectOne("student.selectOneStudent",no);
	}
	/**
	 * Map<String, Object>
	 *  - 컬럼명:String
	 * 	- 컬럼값:Object
	 */
	@Override
	public Map<String, Object> selectOneStudentMap(SqlSession session, int no) {
		return session.selectOne("student.selectOneStudentMap", no);
	}

	@Override
	public int updateStudent(SqlSession session, Student student) {
		return session.update("student.updateStudent", student);
	}

	@Override
	public int deleteStudent(SqlSession session, int no) {
		return session.delete("student.deleteStudent", no);
	}
	/**
	 * 조회된 행이 없는경우 ,빈  ArrayList 객체가 리턴된다.
	 */
	@Override
	public List<Student> selectStudentList(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("student.selectStudentList");
	}

	@Override
	public List<Map<String, Object>> selectStudentMapList(SqlSession session) {
		// TODO Auto-generated method stub
		return session.selectList("student.selectStudentMapList");
	}
	

}