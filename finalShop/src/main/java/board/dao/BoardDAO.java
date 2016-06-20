package board.dao;

import java.util.List;

import board.dto.BoardDTO;

public interface BoardDAO {
	//ȸ���ο��� ��ȸ
	int count();
	//ȸ������
	void insert(BoardDTO user);
	//ȸ����������
	void update(BoardDTO user);
	//ȸ��Ż��
	void delete(String id);
	//�α���
	BoardDTO login(String id,String pass);
	//ȸ����Ϻ���
	List<BoardDTO> getMemberList();
	//�ּҷ� �˻�
	List<BoardDTO> findByAddr(String addr);
	
	BoardDTO read(String id);
	
	BoardDTO login(BoardDTO user);
	
	
}









