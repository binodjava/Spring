package com.javainterviewpoint;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@ModelAttribute("professionList")
	public List populateProfessionList() {
		List professionList = new ArrayList();
		professionList.add("Devloper");
		professionList.add("Manager");
		professionList.add("Architecht");

		return professionList;
	}

	@ModelAttribute("hobbyList")
	public List populateHobbyList() {
		List hobbyList = new ArrayList();
		hobbyList.add("Cricket");
		hobbyList.add("Football");
		hobbyList.add("Hockey");
		hobbyList.add("Basketball");

		return hobbyList;
	}

	@RequestMapping("/displayForm")
	public String displayForm(Map model) {
		RegistrationBean rb = new RegistrationBean();
		model.put("rb", rb);
		return "RegistrationForm";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("rb") RegistrationBean rb)
			throws IOException {
		if (rb.getFirstName().length() < 5) {
			throw new IOException("IOException has occured");
		}
		return "success";
	}
}