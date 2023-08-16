package com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observer;

import com.LLD.NotifyMe_Observer_And_Obserable_Design_pattern.Model.observerable.StockObserverableInterface;

public class SmsAlertNotification implements NotificationAlertObserverInterface {

	private String mob;
	StockObserverableInterface observerableInterface;
	public SmsAlertNotification(String mob, StockObserverableInterface observerableInterface) {
		this.mob = mob;
		this.observerableInterface = observerableInterface;
	}

	@Override
	public void update() {
		sendMsg(this.mob, "Product is available");
	}
	
	public void sendMsg(String mob, String msg) {
		System.out.println("Message sent to mobile: "+mob);
	}

}
