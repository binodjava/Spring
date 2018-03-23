package com.javainterviewpoint;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String processRegistration(@Valid @ModelAttribute("rb") RegistrationBean rb,BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result);
			return "RegistrationForm";
		} else {
			System.out.println(result);
			System.out.println(rb.getFirstName());
			System.out.println(rb.getLastName());
			System.out.println(rb.getEmail());
			System.out.println(rb.getProfession());
			System.out.println("Selected Hobby");
			if (rb.getHobby() != null) {
				for (String val : rb.getHobby()) {
					System.out.print(val + "  ");
				}
			}
			return "Success";
		}
	}
}