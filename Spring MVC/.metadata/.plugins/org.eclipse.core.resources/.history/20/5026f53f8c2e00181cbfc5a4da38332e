package com.jlcindia.spring.test;

import java.util.List;

import org.springframework.web.client.RestTemplate;

public class ClientB {
	public static void main(String[] args) {

		RestTemplate rTemp = new RestTemplate();
		System.out.println("All Contacts");

		@SuppressWarnings("unchecked")
		List<Contact> list = rTemp.getForObject("http://localhost:8888/Spring4ControllerAsRESTFullService/rest/contacts/",List.class);
		System.out.println(list);
		System.out.println("---Done---");
	}

}
