package com.subha;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
	
	List<String> carList = new ArrayList<>();
	List<String> vanList = new ArrayList<>();
	List<String> suvList = new ArrayList<>();
	
	public ProductCatalog()
	{
		carList.add("impala");
        carList.add("altima");
        carList.add("avalon");
        
        suvList.add("journey");
        suvList.add("compass");
        suvList.add("pathfinder");
        
        vanList.add("sienna");
        vanList.add("oddessy");
        vanList.add("explorer");
	}
	
	public List<String> getProductCategories()
	{
		List<String> categories = new ArrayList<>();
		categories.add("Cars");
		categories.add("SUVs");
		categories.add("Vans");
		return categories;
		
	}
	
	public List<String> getProducts(String category)
	{
		switch(category) {
		case "Cars":
			return carList;
			
		case "SUVs":
			return suvList;
			
		case "Vans":
			return vanList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product)
	{
		switch(category) {
		case "Cars":
			carList.add(product);
			break;
			
		case "SUVs":
			suvList.add(product);
			break;
			
		case "Vans":
			vanList.add(product);
			break;
			
		default:
			return false;
		}
		return true;
	}

}
