package product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import product.dao.ProductMongoDAO;
import product.mongo.dto.MongoDTO;

@Service
public class ProductMongoServiceImpl implements ProductMongoService {
	@Autowired
	ProductMongoDAO dao;

	@Override
	public List<MongoDTO> findAll() {
		return dao.findAll();
	}

	@Override
	public List<MongoDTO> findAll(int pageNo) {
		return dao.findAll(pageNo);
	}

	
}
