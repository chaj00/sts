package emp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import emp.dto.MyEmpDTO;

@Repository("empmybatis")
public class MyEmpMybatisDAOImpl implements MyEmpDAO{

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insert(MyEmpDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(MyEmpDTO user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyEmpDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyEmpDTO read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
