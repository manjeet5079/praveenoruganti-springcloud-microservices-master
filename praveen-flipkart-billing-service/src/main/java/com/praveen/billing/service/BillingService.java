package com.praveen.billing.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
@Service
public class BillingService {

	public String billingOrder(@Valid String orderid) throws Exception {
		int orderidNum=Integer.parseInt(orderid);
		// This logic is just used for testing the service and will not be used in real time.
		if(orderidNum>0 && orderidNum<100) {
			throw new Exception("Invalid Order ID " + orderid);
		}else if(orderidNum>=100 && orderidNum<500) {
			throw new Exception("Payment failed for Order ID "+orderid);
		}else {
			return "Successfully placed the order "+orderid;
		}
		
	}

}