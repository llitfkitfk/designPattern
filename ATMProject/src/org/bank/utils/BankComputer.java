package org.bank.utils;

import java.util.ArrayList;

import org.bank.account.Account;
import org.bank.transaction.Transaction;

public class BankComputer{

	private int bankId = 9;
	private String bankName = "";
	
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	public static int numOfBanks = 0;
	
	public BankComputer(String newBankName) {
		// TODO Auto-generated constructor stub
		this.bankName = newBankName;
		numOfBanks++;
		this.bankId += numOfBanks;
	}
	
	public void addAccToBank(Account account) {
		// TODO Auto-generated method stub
		this.accounts.add(account);
	}

	public int getBankId() {
		// TODO Auto-generated method stub
		return bankId;
	}

	public Boolean verifyThePIN(Transaction transaction) {
		// TODO Auto-generated method stub
		Boolean cardVerification = false;
		if(transaction.getDidCardVerify()) {
			for(Account account : accounts) {
				if(account.getPin() == transaction.getPIN() && account.getStripNum() == transaction.getStripNum()) {
					cardVerification = true;
					transaction.setCustomerName(account.getCustomerName());
				}
			}
		}
		return cardVerification;
	}

	public void requestWithdrawalAmt(Transaction transaction) {
		// TODO Auto-generated method stub
		for(Account account : accounts) {
			if(account.getAccNum() == transaction.getAccNumUsed()) {
				if(account.getAccBalance() >= transaction.getWithdrawalAmt()) {
					double newAccBalance = account.getAccBalance() - transaction.getWithdrawalAmt();
					account.setAccBalance(newAccBalance);
					transaction.setAccBalance(newAccBalance);
				} else {
					System.out.println("you cannot withdrawal that much money");
				}
			}
		}
	}
	
}
