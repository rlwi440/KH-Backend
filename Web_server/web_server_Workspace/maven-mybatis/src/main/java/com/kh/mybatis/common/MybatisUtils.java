package com.kh.mybatis.common;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	/**
	 * mybatis-config.xml 설정파일 기반으로 SqlSession객체를 생성반환
	 * build-path(target/classes)로 배포된 설정파일을 읽어들임.
	 * 공장짓는이 - 공장 - SqlSession
	 * SqlSessionFactory는 데이터베이스와의 연결과 SQL의 실행에 대한 모든 것을 가진 가장 중요한 객체다.
	   이 객체가 DataSource를 참조하여 MyBatis와 Mysql 서버를 연동시켜준다.
 	   SqlSessionFactory를 생성해주는 SqlSessionFactoryBean 객체를 먼저 설정하여야 한다.
	 */
	public static SqlSession getSqlSession() {
		SqlSession session = null;
		String resource = "/mybatis-config.xml";
		//1. FactoryBuilder
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//2. Factory생성 - 설정파일
		InputStream is = null;
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory factory = builder.build(is);
		
		//3. SqlSession - autoCommit:boolean  
		session = factory.openSession(false);
		
		
		return session;
	}
}





