package com.microservice.customer.resource;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping("/message")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String headerKey = headers.nextElement();
			String headerValue = request.getHeader(headerKey);
			System.out.println(headerKey +" : "+headerValue);
		}
		return "Hello from Customer Service";
	}
}
