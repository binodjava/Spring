package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

public class ClientD {
	public static void main(String[] args) {
		
		RestTemplate rTemp = new RestTemplate();
		System.out.println("Delete Contact by Id");
		rTemp.delete("http://localhost:8888/Spring3ControllerAsRESTFullService/rest/contacts/2");
		System.out.println("---Done---");
		
	}

}
