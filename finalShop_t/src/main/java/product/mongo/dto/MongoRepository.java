package product.mongo.dto;

import org.springframework.data.repository.PagingAndSortingRepository;

//�ƹ��͵� �������� ���� ���� - CRUD�� ������ �⺻ �żҵ带 ���� �ִ� repository�� �ۼ��� ����
//					spring-data���ο��� �ڵ����� ����
public interface MongoRepository 
						extends PagingAndSortingRepository<MongoDTO, String> {



}
