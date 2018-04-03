package com.pe.devinspirare.model;

import java.io.Serializable;
import java.util.Date;

public class Transaction implements Serializable {
	private Integer code;
	private String description;
	private double mount;
	private String bankOfOrigin;
	private Date transactionDate;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMount() {
		return mount;
	}

	public void setMount(double mount) {
		this.mount = mount;
	}

	public String getBankOfOrigin() {
		return bankOfOrigin;
	}

	public void setBankOfOrigin(String bankOfOrigin) {
		this.bankOfOrigin = bankOfOrigin;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
