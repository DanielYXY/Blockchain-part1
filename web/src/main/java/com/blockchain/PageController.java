package com.blockchain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController
{
	//默认跳转首页
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
}
