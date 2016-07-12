package product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import product.mongo.dto.MongoDTO;
import product.mongo.dto.MongoRepository;

@Repository
public class ProductMongoDAOImple implements ProductMongoDAO {
	@Autowired
	MongoRepository repository;

	@Override
	public List<MongoDTO> findAll(){
		List<MongoDTO> mongolist = (List<MongoDTO>)repository.findAll();
		System.out.println(mongolist.size());
		return mongolist;
	}
	
	public List<MongoDTO> findAll(int pageNo){
		Page<MongoDTO> page = repository.findAll(new PageRequest(pageNo, 3));
		List<MongoDTO> mongolist = page.getContent();
		
		return mongolist;
	}
	

}
