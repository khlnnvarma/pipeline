package com.accenture.ebs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "order",consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
public class OrderController {

	
	private OrderDetails[] orderDetails;
	
	@PostMapping("details/save")
	public String saveOrderDetails(@RequestBody OrderDetails[] orderDetails)
	{
		this.orderDetails = orderDetails;
		return "Success";
	}
	
	
	@GetMapping("get/details")
	public OrderDetails[] getOrderDetails()
	{
		return this.orderDetails;
	}
}
