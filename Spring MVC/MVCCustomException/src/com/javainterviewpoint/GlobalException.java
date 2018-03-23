package com.javainterviewpoint;

import java.io.IOException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(IOException.class)
	public ModelAndView processIOException(IOException ioe) {
		ModelAndView mav = new ModelAndView("exceptionPage");
		mav.addObject("name", ioe.getClass().getSimpleName());
		mav.addObject("message", ioe.getMessage());

		return mav;
	}

	@ExceptionHandler(UserDefinedException.class)
	public ModelAndView processCustomException(UserDefinedException ud) {
		ModelAndView mav = new ModelAndView("exceptionPage");
		mav.addObject("name", ud.getName());
		mav.addObject("message", ud.getMessage());

		return mav;
	}
}