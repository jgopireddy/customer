package com.microservice.customer.resource;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.customer.CustomerRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@PostMapping("/message")
	public String test(HttpServletRequest request, HttpServletResponse response, @RequestBody CustomerRequest helloRequest) {
		Enumeration<String> headers = request.getHeaderNames();
		while(headers.hasMoreElements()) {
			String headerKey = headers.nextElement();
			String headerValue = request.getHeader(headerKey);
			System.out.println(headerKey +" : "+headerValue);
		}
		return "Hello from Customer Service";
	}
}
