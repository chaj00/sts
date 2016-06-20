package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	void insert(BoardDTO board);
	void update(BoardDTO board);
	void delete(String board_no);
	List<BoardDTO> getBoardList();
	BoardDTO read(String board_no);
	
}









