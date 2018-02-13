package test.spring.web;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

@Controller
public class Home {
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
}
