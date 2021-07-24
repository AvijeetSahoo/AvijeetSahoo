package com.example.demo.entity;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal quantiy;
	private BigDecimal conversionMultiple;
	private BigDecimal totalCalculateAmount;
	private String environment;
	
	public CurrencyConversion(Long id, String from, String to, BigDecimal quantiy, BigDecimal conversionMultiple, 
			BigDecimal totalCalculateAmount, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantiy = quantiy;
		this.totalCalculateAmount = totalCalculateAmount;
		this.environment = environment;
	}

	public CurrencyConversion() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(BigDecimal quantiy) {
		this.quantiy = quantiy;
	}

	public BigDecimal getTotalCalculateAmount() {
		return totalCalculateAmount;
	}

	public void setTotalCalculateAmount(BigDecimal totalCalculateAmount) {
		this.totalCalculateAmount = totalCalculateAmount;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
