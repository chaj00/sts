package spring.data.mongodb.dto;

import org.springframework.data.repository.PagingAndSortingRepository;

//�ƹ��͵� �������� ���� ���� - CRUD�� ������ �⺻ �żҵ带 ���� �ִ� repository�� �ۼ��� ����
//					spring-data���ο��� �ڵ����� ����
public interface ScoreRepository 
						extends PagingAndSortingRepository<Score, String> {
	
	

}
