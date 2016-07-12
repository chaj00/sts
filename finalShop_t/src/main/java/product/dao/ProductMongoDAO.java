package product.dao;

import java.util.List;

import product.mongo.dto.MongoDTO;

public interface ProductMongoDAO {
	public List<MongoDTO> findAll();
	public List<MongoDTO> findAll(int pageNo);
	
	
}
