package com.batch2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	@Autowired
	LoanService loanService;

	@RequestMapping("/fetchOffers")
	public void fetchOffers(Loan loan) {
		loanService.save(loan);
		
		int area_code = loan.getArea_code();
		double area_size = loan.getArea_size();
		
		
		String residence = loan.getLegal_residence();
		double price=loanService.getPropertyPrice(area_code, area_size);
		
	}
	
}
