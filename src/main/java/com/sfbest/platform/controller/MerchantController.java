package com.sfbest.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfbest.platform.domain.MerchantInfo;
import com.sfbest.platform.service.MerchantService;

@RestController
@RequestMapping(value = "/merchant")
public class MerchantController {
	@Autowired
	private MerchantService merchantSercice ; 
	@RequestMapping("/")
	public String home(){
		MerchantInfo merchant = this.merchantSercice.getMerchant();
		return merchant.toString();
	}
}
