package com.free.lotto.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LotteryController {
	
	@RequestMapping("/")
	public String index() {
		return "Welcome to the Magic Lottery Helper!";
	}

}
