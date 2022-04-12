package com.course.education.model;

public class Coursecategory {
	private Computers computers;
	private MutualFunds mutualfunds;
	public Coursecategory(Computers computers, MutualFunds mutualfunds) {
		super();
		this.computers = computers;
		this.mutualfunds = mutualfunds;
	}
	public Coursecategory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computers getComputers() {
		return computers;
	}
	public void setComputers(Computers computers) {
		this.computers = computers;
	}
	public MutualFunds getMutualfunds() {
		return mutualfunds;
	}
	public void setMutualfunds(MutualFunds mutualfunds) {
		this.mutualfunds = mutualfunds;
	}
	@Override
	public String toString() {
		return "Coursecategory [computers=" + computers + ", mutualfunds=" + mutualfunds + "]";
	}
	

}
