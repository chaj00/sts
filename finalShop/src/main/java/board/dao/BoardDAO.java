package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	void insert(BoardDTO board);
	void update(BoardDTO board);
	void delete(String board_no);
	List<BoardDTO> getBoardList();
	BoardDTO read(String board_no);
	void count_update(String board_no);
	
}









