package com.microservice.customer;

import lombok.Data;

@Data
public class CustomerRequest{
	private String number;
	private String firstName;
	private double salary;
	
}
