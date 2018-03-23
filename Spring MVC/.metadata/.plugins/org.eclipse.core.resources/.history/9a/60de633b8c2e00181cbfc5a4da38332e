package com.jlcindia.spring.test;

import org.springframework.web.client.RestTemplate;

public class ClientA {
	public static void main(String[] args) {
		RestTemplate rTemp = new RestTemplate();

		Contact con = new Contact();
		con.setName("Binod");
		con.setEmail("binodk.java@gmail.com");
		con.setPhone(8310450115L);

		// boolean res=rTemp.postForObject(url, request, responseType)
		boolean res = rTemp.postForObject("http://localhost:8888/Spring4ControllerAsRESTFullService/rest/contacts/",con, Boolean.class);

		if (res) {
			System.out.println("Contact added successfylly");
		} else {
			System.out.println("Contact doesn't added successfully");
		}
		System.out.println("----Done----");

	}

}
