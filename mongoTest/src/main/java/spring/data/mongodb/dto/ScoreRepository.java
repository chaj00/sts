package spring.data.mongodb.dto;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

//�ƹ��͵� �������� ���� ���� - CRUD�� ������ �⺻ �żҵ带 ���� �ִ� repository�� �ۼ��� ����
//					spring-data���ο��� �ڵ����� ����
public interface ScoreRepository 
						extends PagingAndSortingRepository<Score, String> {

	
	

}
