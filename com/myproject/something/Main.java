package com.myproject.something;

import java.util.ArrayList;

import java.util.List;


class Product {
    public Product(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}
	private int productId;
    private String productName;
    private double productPrice;
	public String getProductName() {
		
		return null;
	}
	public void setProductPrice(int i) {
		// TODO Auto-generated method stub
		
	}
}

public class Main {
    public static void main(String[] args) {
        // 1. Create the ArrayList store the products data
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "laptop", 12000));
        products.add(new Product(102, "mobile", 7000));
        products.add(new Product(103, "tab", 22000));
        products.add(new Product(104, "speakers", 2500));
        products.add(new Product(105, "tv", 11000));
        
        //update the TV price to 20000
        for(Product product:products )
        {
        	if(product.getProductName().equalsIgnoreCase("tv"))
        	{
        		product.setProductPrice(20000);
        		break;
        	}
        }


}
}
