package com.batch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
	@Autowired
	LoanRepository loanRepository;
    public String save(Loan loan) {
    	loanRepository.save(loan);
		return "added Succeesfully";
    }
    public double getPropertyPrice(int area_code, double area_size) {
		double price;
		if (area_code >= 10 && area_code < 99) {
			price = area_size * 1000;
		} else if (area_code >= 100 && area_code < 1000) {
			price = area_size * 1100;
		} else {
			price = area_size * 1200;
		}
		return price;
	}
}
