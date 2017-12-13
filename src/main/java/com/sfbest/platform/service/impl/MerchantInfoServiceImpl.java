package com.sfbest.platform.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfbest.platform.dao.MerchantMapper;
import com.sfbest.platform.domain.MerchantInfo;
import com.sfbest.platform.service.MerchantInfoService;

@Service
public class MerchantInfoServiceImpl  implements MerchantInfoService{
	
	@Autowired
	private MerchantMapper merchantMapper;
	
	@Override
	public MerchantInfo getMerchant(Integer merchantNumber) {
		return merchantMapper.getMerchant(merchantNumber);
	}
	
}
