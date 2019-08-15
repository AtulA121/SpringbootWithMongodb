package com.SpringBootWithMongoDb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newController {
	@RequestMapping("/")
	public String homepage()
	{
		System.out.println("/ request...");
		return "index.jsp";
	}
}
