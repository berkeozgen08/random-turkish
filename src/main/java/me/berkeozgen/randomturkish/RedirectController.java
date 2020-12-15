package me.berkeozgen.randomturkish;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	
	@RequestMapping("*")
	public String redirect() {
		return "redirect:/get?count=1";
	}

}
