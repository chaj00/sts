package product.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import product.dto.ProductDTO;

@Repository("mybatisprddao")
public class ProductMybatisDAOImpl implements ProductDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<ProductDTO> productlist(String category) {
		return sqlSession.selectList("kitri.finalShop.prdlist", category);
	}

	@Override
	public List<ProductDTO> searchTopProduct() {
		return sqlSession.selectList("kitri.finalShop.searchtoplist");
	}

	@Override
	public ProductDTO read(String prd_no) {
		// TODO Auto-generated method stub
		return null;
	}

}
