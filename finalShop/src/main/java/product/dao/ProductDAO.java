package product.dao;

import java.util.List;

import product.dto.ProductDTO;

public interface ProductDAO {
	List<ProductDTO> productlist (String category_no);
	List<ProductDTO> productlist (ProductDTO category_no);
	List<ProductDTO> searchTopProduct();
	ProductDTO read(String prd_no);
}
