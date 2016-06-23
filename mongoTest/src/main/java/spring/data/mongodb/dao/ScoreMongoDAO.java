package spring.data.mongodb.dao;

import java.util.List;

import spring.data.mongodb.dto.ScoreDTO;

public interface ScoreMongoDAO {
	public ScoreDTO findById(String id);
	public List<ScoreDTO> findCriteria(String field,String value);
	public ScoreDTO findById(String key,String value);
	public void insertDocument(ScoreDTO doc);
	public void insertAllDocument(List<ScoreDTO> docs);
	
	public void delete(String key, String value);
	public void update(ScoreDTO doc);
	
}
