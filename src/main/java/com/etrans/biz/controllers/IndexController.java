package com.etrans.biz.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController implements ErrorController {

	@GetMapping("${server.error.path:${error.path:/error}}")
	public String error() {
		return "forward:/index.html";
	}

}
