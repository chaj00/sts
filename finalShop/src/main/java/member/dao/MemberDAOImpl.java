package member.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import member.dto.MemberDTO;

@Repository("memberdao")
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public int memberInsert(Connection conn, MemberDTO user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberDTO login(MemberDTO user)  {
		System.out.println(sqlSession.selectOne("kitri.finalShop2.login", user));
		return sqlSession.selectOne("kitri.finalShop2.login", user);
	}

	@Override
	public boolean idCheck(Connection conn, String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
