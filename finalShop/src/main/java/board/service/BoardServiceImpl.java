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
	@Qualifier("empmybatis")
	BoardDAO dao;


	@Override
	public int count() {
		return dao.count();
	}

	@Override
	public void insert(BoardDTO user) {
		dao.insert(user);
	}

	@Override
	public void update(BoardDTO user) {
		dao.update(user);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public BoardDTO login(String id, String pass) {
		return null;
	}

	@Override
	public List<BoardDTO> getMemberList() {
		return dao.getMemberList();
	}

	@Override
	public List<BoardDTO> findByAddr(String addr) {
		return dao.findByAddr(addr);
	}

	@Override
	public BoardDTO read(String id) {
		return dao.read(id);
	}

	@Override
	public void txinsert(BoardDTO user) {
		dao.insert(user);
		dao.insert(null);
		
	}

	@Override
	public BoardDTO login(BoardDTO user) {
		return dao.login(user);
	}

	
}
