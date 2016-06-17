package product.service;

import java.util.List;

import product.dto.ProductDTO;

public interface ProductService {
	List<ProductDTO> productlist(String category_no);
	List<ProductDTO> productlist(ProductDTO category_no);	//ProductDAOImpl�� productlist()�� ȣ���ϴ� �޼ҵ�
	List<ProductDTO> searchTopProduct();
	ProductDTO read(String prd_no);
}
