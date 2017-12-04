package com.sfbest.platform.domain;

public class MerchantInfo {
	private Integer merchantId ;
	private Integer merchantNumber ; 
	private String merchantName ;
	public Integer getMerchantNumber() {
		return merchantNumber;
	}
	public void setMerchantNumber(Integer merchantNumber) {
		this.merchantNumber = merchantNumber;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	} 
	
	
}
