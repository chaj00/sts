package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.BoardDAO;
import board.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	@Qualifier("boarddao")
	BoardDAO dao;

	@Override
	public void insert(BoardDTO board) {
		dao.insert(board);
	}

	@Override
	public void update(BoardDTO board) {
		dao.update(board);
	}

	@Override
	public void delete(String board_no) {
		dao.delete(board_no);
	}

	@Override
	public List<BoardDTO> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public BoardDTO read(String board_no) {
		return dao.read(board_no);
	}

	@Override
	public void count_update(String board_no) {
		dao.count_update(board_no);	
	}




	
}
