package com.accenture.ebs;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderDetails {

	private int id;
	
	private String type;
	
	private int price;
	
	private String productName;
}
