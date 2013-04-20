package org.bank.transaction;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;

import org.bank.network.BankNetwork;

public class Transaction {
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	private int bankId;
	private Date currentDate;
	private String customerName;
	private double accBalance;
	private int withdrawalAmt;
	private int accNumUsed;
	private int pin;
	private int stripNum;
	private int accToWithdrawalFrom;
	
	private boolean didCardVerify = false;
	
	public Transaction(int stripNum) {
		// TODO Auto-generated constructor stub
		this.bankId = BankNetwork.getFirstTwoDigits(stripNum);
		currentDate = new Date();
		this.accNumUsed = stripNum;
	}

	public void setStripNum(int stripNum) {
		// TODO Auto-generated method stub
		this.stripNum = stripNum;
	}

	public void setDidtheCardVerify(boolean b) {
		// TODO Auto-generated method stub
		didCardVerify = (b)? true:false;
	}

	public void setPIN(int i) {
		// TODO Auto-generated method stub
		this.pin = i;
	}

	public boolean getDidCardVerify() {
		// TODO Auto-generated method stub
		return didCardVerify;
	}

	public int getBankId() {
		// TODO Auto-generated method stub
		return bankId;
	}

	public void setAccTowithdrawalFrom(int numEnter) {
		// TODO Auto-generated method stub
		this.accToWithdrawalFrom = numEnter;
		this.accNumUsed = (stripNum * 10) + accToWithdrawalFrom;
	}

	public void setWithdrawalAmt(int numEnter) {
		// TODO Auto-generated method stub
		this.withdrawalAmt = numEnter;
	}

	public String getCustomerName() {
		// TODO Auto-generated method stub
		return customerName;
	}

	public String getCurrentDateTime() {
		// TODO Auto-generated method stub
		return dateFormat.format(currentDate);
	}

	public int getWithdrawalAmt() {
		// TODO Auto-generated method stub
		return withdrawalAmt;
	}

	public int getAccToWithdrawalFrom() {
		// TODO Auto-generated method stub
		return accToWithdrawalFrom;
	}

	public double getAccBalance() {
		// TODO Auto-generated method stub
		return accBalance;
	}

	public int getPIN() {
		// TODO Auto-generated method stub
		return pin;
	}

	public int getStripNum() {
		// TODO Auto-generated method stub
		return stripNum;
	}

	public void setCustomerName(String customerName2) {
		// TODO Auto-generated method stub
		this.customerName = customerName2;
	}

	public int getAccNumUsed() {
		// TODO Auto-generated method stub
		return accNumUsed;
	}

	public void setAccBalance(double newAccBalance) {
		// TODO Auto-generated method stub
		this.accBalance = newAccBalance;
	}

}
