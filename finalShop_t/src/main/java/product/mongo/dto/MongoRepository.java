package product.mongo.dto;

import org.springframework.data.repository.PagingAndSortingRepository;

//아무것도 정의하지 않을 것임 - CRUD를 접근할 기본 매소드를 갖고 있는 repository를 작성한 것임
//					spring-data내부에서 자동으로 매핑
public interface MongoRepository 
						extends PagingAndSortingRepository<MongoDTO, String> {



}
