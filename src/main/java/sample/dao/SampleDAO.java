package sample.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SampleDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public String sample() {
		return sqlSession.selectOne("mm.sample");
	}
	
}
