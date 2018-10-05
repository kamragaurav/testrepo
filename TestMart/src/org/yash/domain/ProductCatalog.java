package org.yash.domain;

import java.util.ArrayList;
import java.util.List;

import javax.jws.HandlerChain;
import javax.jws.WebService;

@HandlerChain(file = "handler-chain.xml")
@WebService
public class ProductCatalog {
	
	public List<String> getProductsCategories(){
		List<String> categories = new ArrayList<>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}

}
