package com.skools.auth.util;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SMSSender {

	private String API_KEY = "A74eee3c4d478eb66dd39d9100482f8f7";

	public void send(String mobileNumber, String message, String sender) {
		RestTemplate template = new RestTemplate();
		template.postForLocation("http://api-alerts.solutionsinfini.com/v4/?method=sms&api_key=" + API_KEY + "&to="
				+ mobileNumber + "&sender=SIDEMO&message=" + message, null);
	}
}
