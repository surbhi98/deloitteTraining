package com.delloite.cms.models;

public class PremiumCustomer extends Customer {
	
	private int rewardPoints;
	
	public PremiumCustomer() {
		// TODO Auto-generated constructor stub
	}

	public PremiumCustomer(int customerId, String customerName, String customerAddress, int billAmount) {
		super(customerId, customerName, customerAddress, billAmount);
		// TODO Auto-generated constructor stub
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
