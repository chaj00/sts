package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.BoardDTO;

@Repository("boarddao")
public class BoardMybatisDAOImpl implements BoardDAO{
	//Spring���� Mybatis�� ����ϱ� ���� ��� ����� �������ִ� �ٽ� Ŭ���� - JdbcTemplate�� ���� ����
	@Autowired
	SqlSession sqlSession;

	@Override
	public void insert(BoardDTO board) {
		sqlSession.insert("kitri.finalShop.board_insert",board);
		
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
		return sqlSession.selectList("kitri.finalShop.board_list");
	}

	@Override
	public BoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
