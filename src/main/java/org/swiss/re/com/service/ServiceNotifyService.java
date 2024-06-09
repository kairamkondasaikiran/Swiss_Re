package org.swiss.re.com.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.swiss.re.com.model.Order;

@Service
public class ServiceNotifyService {

	@Async
	public void notifyServiceB(Order order) {
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
