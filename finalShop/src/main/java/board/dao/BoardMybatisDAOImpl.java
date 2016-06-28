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
		sqlSession.update("kitri.finalShop.board_update",board);
	}

	@Override
	public void delete(String board_no) {
		sqlSession.delete("kitri.finalShop.board_delete",board_no);
	}

	@Override
	public List<BoardDTO> getBoardList() {
		return sqlSession.selectList("kitri.finalShop.board_list");
	}

	@Override
	public BoardDTO read(String board_no) {
		return sqlSession.selectOne("kitri.finalShop.board_read", board_no);
	}

	@Override
	public void count_update(String board_no) {
		sqlSession.update("kitri.finalShop.board_count", board_no);
	}
	


}
