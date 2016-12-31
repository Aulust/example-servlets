package test.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Home {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String init(@ModelAttribute("model") ModelMap model) {
		model.addAttribute("name", "Test name");
		model.addAttribute("comment", "Test comment");

		return "index";
	}
}
