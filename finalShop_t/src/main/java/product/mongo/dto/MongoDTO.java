package product.mongo.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mongo")
public class MongoDTO {
	@Id
	private String site;
	private String price;
	
	public MongoDTO(){
		
	}
	public MongoDTO(String site, String price) {
		super();
		this.site = site;
		this.price = price;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "mongoDTO [site=" + site + ", price=" + price + "]";
	}
	
	
}
