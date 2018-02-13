package test.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/calc")
public class Calc {
	@RequestMapping(path="/{value}", method = RequestMethod.GET)
	public String calc(@PathVariable Integer value, Model model) {
		model.addAttribute("value", value + 1);
		return "calc";
	}
}
