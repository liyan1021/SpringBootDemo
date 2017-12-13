package com.sfbest.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfbest.platform.domain.MerchantInfo;
import com.sfbest.platform.service.MerchantInfoService;

@RestController
@RequestMapping(value = "/merchant")
public class MerchantController {
	@Autowired
	private MerchantInfoService merchantInfoService;
	
	@RequestMapping("/")
	public String home(Integer merchantNumber){
		MerchantInfo merchant = this.merchantInfoService.getMerchant(merchantNumber);
		return merchant.getMerchantName();
	}
}
