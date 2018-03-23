package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

public class ClientC {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();
		System.out.println("Contact by Id");
		Contact con1=rTemp.getForObject("http://localhost:8888/Spring3ControllerAsRESTFullService/rest/contacts/1", Contact.class);
		
		System.out.println(con1);
		
		System.out.println("---Done---");
				
	}

}
