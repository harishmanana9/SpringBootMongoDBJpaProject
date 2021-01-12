package com.spring.repo;
import com.spring.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

//@Repository
public interface ProductRepository extends MongoRepository<Product, String>{
//	@Query(value="{'products.productName' : ?0}", fields= "{'products' : 0}" )
//	Product findProductByProductName(String productName);
//	
	public Product findByProductName(String productName);
	public Product findByProductNo(Integer productNo);
}
