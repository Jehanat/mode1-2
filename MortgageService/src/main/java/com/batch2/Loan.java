package com.batch2;

public class Loan {
    private int loan_id;
    private int loanamount;
    private int area_code;
    private double area_size;
    private String legal_residence;
	public int getLoan_id() {
		return loan_id;
	}
	public void setLoan_id(int loan_id) {
		this.loan_id = loan_id;
	}
	public int getLoanamount() {
		return loanamount;
	}
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	public int getArea_code() {
		return area_code;
	}
	public void setArea_code(int area_code) {
		this.area_code = area_code;
	}
	public double getArea_size() {
		return area_size;
	}
	public void setArea_size(double area_size) {
		this.area_size = area_size;
	}
	public String getLegal_residence() {
		return legal_residence;
	}
	public void setLegal_residence(String legal_residence) {
		this.legal_residence = legal_residence;
	}
	@Override
	public String toString() {
		return "Loan [loan_id=" + loan_id + ", loanamount=" + loanamount + ", area_code=" + area_code + ", area_size="
				+ area_size + ", legal_residence=" + legal_residence + "]";
	}  
}