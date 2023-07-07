package com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer;

import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable.StockObserverableInterface;

public class EmailAlertNotification implements NotificationAlertObserverInterface {

	private String email;
	StockObserverableInterface observerableInterface;
	
	public EmailAlertNotification(String email, StockObserverableInterface observerableInterface) {
		this.email = email;
		this.observerableInterface = observerableInterface;
	}

	@Override
	public void update() {
		sendEmail(email, "Stock is available");
	}
	
	private void sendEmail(String email, String msg) {
		System.out.println("Mail sent to: "+email+" --> "+msg);
	}

}
