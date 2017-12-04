package com.sfbest.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfbest.platform.dao.MerchantMapper;
import com.sfbest.platform.domain.MerchantInfo;
import com.sfbest.platform.service.MerchantService;

@Service
public class MerchantServiceImpl  implements MerchantService{
	@Autowired
	private MerchantMapper merchantMapper;
	
	@Override
	public MerchantInfo getMerchant() {
		return merchantMapper.getMerchant(1);
	}
	
}
