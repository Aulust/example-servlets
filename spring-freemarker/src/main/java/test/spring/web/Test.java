package test.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class Test {
	@RequestMapping(value = "/1", method = RequestMethod.GET)
	@ResponseBody
	public String test1() {
		return "Some data";
	}

	@RequestMapping(value = "/2", method = RequestMethod.GET, params = "a=10")
	@ResponseBody
	public String test2(@RequestParam Integer a) {
		return String.valueOf(a);
	}
}
