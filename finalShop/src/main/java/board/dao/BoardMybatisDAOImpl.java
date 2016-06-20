package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;

@Repository("boarddao")
public class BoardMybatisDAOImpl implements BoardDAO{
	//Spring에서 Mybatis를 사용하기 위한 모든 기능을 제공해주는 핵심 클래스 - JdbcTemplate과 같은 개념
	@Autowired
	SqlSession sqlSession;

	@Override
	public void insert(BoardDTO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BoardDTO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String board_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> getBoardList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
