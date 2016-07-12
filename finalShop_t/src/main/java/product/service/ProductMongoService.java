package product.service;

import java.util.List;

import product.mongo.dto.MongoDTO;

public interface ProductMongoService {
	public List<MongoDTO> findAll();
	public List<MongoDTO> findAll(int pageNo);
	
	
}
