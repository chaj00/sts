package board.service;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardService {
	//회원인원수 조회
	int count();
	//회원가입
	void insert(BoardDTO user);
	//회원정보수정
	void update(BoardDTO user);
	//회원탈퇴
	void delete(String id);
	//로그인
	BoardDTO login(String id,String pass);
	//회원목록보기
	List<BoardDTO> getMemberList();
	//주소로 검색
	List<BoardDTO> findByAddr(String addr);
	
	BoardDTO read(String id);
	
	void txinsert(BoardDTO user);
	
	BoardDTO login(BoardDTO user);
	
}









