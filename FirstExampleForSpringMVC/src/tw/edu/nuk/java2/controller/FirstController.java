package tw.edu.nuk.java2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	
	@RequestMapping("/hello/{member}")
	public String doHello(@PathVariable("member") String MemberName, Model model) {
		
		model.addAttribute("member", MemberName);
		
		return "HelloView";
	}
	
	
	@RequestMapping("/welcome")
	public String doWelcome(@RequestParam(value="member", defaultValue="User") String MemberName, Model model) {
		
		model.addAttribute("member", MemberName);
		
		return "WelcomeView";
	}
	
	@RequestMapping("/news")
	public String doRedirect(@RequestParam(value="url", defaultValue="http://www.yahoo.com.tw") String url) {
		
		return "redirect:"+url;
	}
	
}
